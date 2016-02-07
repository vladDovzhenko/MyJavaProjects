package verify.arguments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 06.02.2016.
 */
public class TransferObject {
    WebDriver driver;
   HelperForCheckFilters helperForCheckFilters;
    public TransferObject(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void transferObjectFilterClassOnCheck(int i, WebElement element){
        helperForCheckFilters=new HelperForCheckFilters(driver);
        element.click();
        helperForCheckFilters.checkFilterByNameClass(i);
    }
    public void transferObjectFilterManufacturerOnCheck(int i, WebElement element){
        helperForCheckFilters=new HelperForCheckFilters(driver);
        element.click();
        helperForCheckFilters.checkFilterByNameManufacturer(i);
    }
}
