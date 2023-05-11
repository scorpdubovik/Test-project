package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailForm extends BasePage {
    private final By pageOpenedIdentifier = By.xpath("//button[starts-with(@class,'container--2lPGK type_grey--1wJTi')]");
    private final By destinationSelector = By.cssSelector(".container--H9L5q.size_s--3_M-_");
    private final By bodySelector = By.xpath("//br/ancestor::div[1]");
    private final By sendButtonSelector = By.xpath("//span[.='Отправить']");

    public MailForm(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(pageOpenedIdentifier);
    }

    private WebElement destinationField() { return driver.findElement(destinationSelector); }
    private WebElement bodyField() { return driver.findElement(bodySelector); }
    private WebElement sendButton() { return driver.findElement(sendButtonSelector); }

    public void enterDestination(final String destination) {
        destinationField().sendKeys(destination);
    }

    public void enterBody(final String body) {
        bodyField().sendKeys(body);
    }

    public void clickSendButton() {
        waits.waitForVisibility(sendButton());
        sendButton().click(); }
}

