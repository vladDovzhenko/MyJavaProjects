package check.filter.price;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 07.02.2016.
 */
public class CheckFilterByNamePrice {
    WebDriver driver;
    HelperForCheckFilterByNamePrice helperPrice;
    public CheckFilterByNamePrice(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void valueTransfer(){
        String min="3900";
        String max="4000";
        System.out.println("Check Filter(Price):");
        helperPrice=new HelperForCheckFilterByNamePrice(driver);
        helperPrice.textForInputFieldPriceMinAndMax(min,max);

    }

}
