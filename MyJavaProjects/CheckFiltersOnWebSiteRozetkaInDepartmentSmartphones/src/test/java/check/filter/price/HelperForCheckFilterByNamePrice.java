package check.filter.price;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

/**
 * Created by Vlad on 07.02.2016.
 */
public class HelperForCheckFilterByNamePrice {
    WebDriver driver;
    @FindBy(xpath = ".//*[@id='price[min]']")
    public WebElement inputFieldPriceMin;
    @FindBy(xpath = ".//*[@id='price[max]']")
    public WebElement inputFieldPriceMax;
    @FindBy(xpath = ".//*[@id='submitprice']")
    public WebElement ok;
String min,max;
    public HelperForCheckFilterByNamePrice(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void textForInputFieldPriceMinAndMax(String min,String max)  {
        this.min=min;
        this.max=max;
        inputFieldPriceMin.click();
        inputFieldPriceMin.sendKeys(min);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputFieldPriceMax.click();
        inputFieldPriceMax.clear();
        inputFieldPriceMax.sendKeys(max);
        ok.submit();
    }

}
