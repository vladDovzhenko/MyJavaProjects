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
        System.out.println("Check Filter(Price):");
        helperPrice=new HelperForCheckFilterByNamePrice(driver);
        helperPrice.textForInputFieldPriceMin("450");
        helperPrice.textForInputFieldPriceMax("3500");
        helperPrice.clickOnOkButton();
    }

}
