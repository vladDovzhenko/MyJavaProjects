package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vlad on 05.02.2016.
 */
public class ElementPresent {
    WebDriver driver;
    public ElementPresent(WebDriver driver) {
        this.driver=driver;
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement( by );
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
