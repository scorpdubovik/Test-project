package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserMailPage extends BasePage {
    private final By pageOpenedIdentifier = By.xpath("//div[text()='Входящие']");
    private final By writeLetterButtonSelector = By.xpath("//a[starts-with(@class,'compose-button')]");

    public UserMailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(pageOpenedIdentifier);
    }

    private WebElement writeLetterButton() {
        return driver.findElement(writeLetterButtonSelector);
    }

    public void clickWriteLetterButton() {
        waits.waitForVisibility(writeLetterButton());
        writeLetterButton().click(); }
}

