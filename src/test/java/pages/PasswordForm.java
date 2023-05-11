package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordForm extends BasePage {
    private final By pageOpenedIdentifier = By.cssSelector("h3[data-test-id='header-text']");
    private final By passwordSelector = By.name("password");
    private final By enterButtonSelector = By.xpath("//span[.='Войти']");

    public PasswordForm(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(pageOpenedIdentifier);
    }

    private WebElement passwordField() {
        return driver.findElement(passwordSelector);
    }

    private WebElement enterButton() {
        return driver.findElement(enterButtonSelector);
    }

    public void enterPassword(final String password) {
        waits.waitForVisibility(passwordField());
        passwordField().sendKeys(password);
    }

    public void clickEnterButton() {
        enterButton().click();
    }
}

