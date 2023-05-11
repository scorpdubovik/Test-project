package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm extends BasePage {
    private final By pageOpenedIdentifier = By.cssSelector("h3[data-test-id='header-text']");
    private final By loginFrameSelector = By.cssSelector("iframe[class='ag-popup__frame__layout__iframe']");
    private final By loginSelector = By.cssSelector("input[name='username']");
    private final By enterPasswordButtonSelector = By.cssSelector("button[data-test-id='next-button']");

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(pageOpenedIdentifier);
    }
    private WebElement loginFrame() {return driver.findElement(loginFrameSelector);}
    private WebElement loginField() {return driver.findElement(loginSelector);}
    private WebElement enterPasswordButton() {
        return driver.findElement(enterPasswordButtonSelector);
    }

    public void switchToLoginFrame() { driver.switchTo().frame(loginFrame()); }

    public void enterLogin(final String login) { loginField().sendKeys(login); }

    public void clickEnterPasswordButton() { enterPasswordButton().click(); }
}

