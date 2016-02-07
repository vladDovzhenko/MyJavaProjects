package verify.arguments;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 06.02.2016.
 */
public class ElementPresent {
        WebDriver driver;
        public ElementPresent(WebDriver driver) {
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
