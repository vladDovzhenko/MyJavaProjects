package isElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 10.02.2016.
 */
public class VerifyElementPresent {
    WebDriver driver;
    public VerifyElementPresent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
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
