package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import utils.Waits;

public abstract class BasePage {
    protected WebDriver driver;
    protected Waits waits;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    public boolean isPageOpened(By locator) {
        try {
            return waits.waitForVisibility(locator).isDisplayed();
        } catch (NoSuchElementException nsex) {
            return false;
        }

    }
}
