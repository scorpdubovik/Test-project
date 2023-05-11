package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private final By pageOpenedIdentifier = By.cssSelector("a[data-testid='mailbox-create-link']");
    private final By loginButtonSelector = By.cssSelector("button[data-testid='enter-mail-primary']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(pageOpenedIdentifier);
    }

    private WebElement loginButton() {
        return driver.findElement(loginButtonSelector);
    }

    public void clickLoginButton() {
        loginButton().click();
    }

}


