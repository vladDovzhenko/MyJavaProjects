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

    public HelperForCheckFilterByNamePrice(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void enterInInputFieldPriceMin(String text){
        inputFieldPriceMin.sendKeys(text);
    }
    public void textForInputFieldPriceMin(String text) {
        this.enterInInputFieldPriceMin(text);
    }
    public void textForInputFieldPriceMax(String text) {
        this.enterInInputFieldPriceMax(text);
    }
    public void enterInInputFieldPriceMax(String text){
        inputFieldPriceMax.sendKeys(text);
    }
    public void clickOnOkButton(){
        ok.click();
    }
}
