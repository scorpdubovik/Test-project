package tests;

import baseEntities.BaseTest;

import core.ReadProperties;
import models.Mail;
import models.User;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class Tests extends BaseTest {
    private static final Logger logger = Logger.getLogger(Tests.class);

    @Test
    public void loginAndSendLetterTest() {
        MainPage mainPage = new MainPage(driver);
        LoginForm loginForm = new LoginForm(driver);
        PasswordForm passwordForm = new PasswordForm(driver);

        User user = new User(ReadProperties.getLogin(),ReadProperties.getPassword());
        Mail mail = new Mail(ReadProperties.getRecipientsMail(), ReadProperties.getMailBody());

        logger.info("Start login test");
        mainPage.clickLoginButton();
        loginForm.switchToLoginFrame();
        Assert.assertTrue(loginForm.isPageOpened(), "Login form isn't open");
        loginForm.enterLogin(user.getLogin());
        loginForm.clickEnterPasswordButton();
        Assert.assertTrue(passwordForm.isPageOpened(), "Password form isn't open");
        passwordForm.enterPassword(user.getPassword());
        passwordForm.clickEnterButton();

        logger.info("Send letter test");
        UserMailPage userMailPage = new UserMailPage(driver);
        Assert.assertTrue(userMailPage.isPageOpened(), "User mail page isn't open");
        userMailPage.clickWriteLetterButton();
        MailForm mailForm = new MailForm(driver);
        Assert.assertTrue(mailForm.isPageOpened(), "Mail form isn't open");
        mailForm.enterDestination(mail.getMailAddress());
        mailForm.enterBody(mail.getMailBody());
        mailForm.clickSendButton();
    }
}

