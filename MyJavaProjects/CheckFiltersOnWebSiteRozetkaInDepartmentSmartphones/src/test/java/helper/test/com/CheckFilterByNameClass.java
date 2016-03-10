package helper.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import verify.arguments.ElementPresent;
import verify.arguments.TransferObject;

/**
 * Created by Vlad on 06.02.2016.
 */
public class CheckFilterByNameClass {
WebDriver driver;
    ElementPresent el;
    TransferObject transferObject;
    @FindBy(xpath = ".//i[contains(text(),\"Акционные предложения\")]")
    public WebElement firstElementFilterClass;

    @FindBy(xpath = ".//i[contains(text(),\"Две SIM-карты\")]")
    public WebElement secondElementFilterClass;

    @FindBy(xpath = ".//i[contains(text(),\"Флагманы\")]")
    public WebElement thirdElementFilterClass;
    @FindBy(xpath = ".//div[@class=\"g-i-tile g-i-tile-catalog\"]")
    public WebElement form;

    public CheckFilterByNameClass(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void addmisonObjectsFilterClass(){
        transferObject=new TransferObject(driver);
        System.out.println("Checking the Filter(Class):");
        for (int i=1;i<4;i++){
            if(i==1){
                transferObject.transferObjectFilterClassOnCheck(i,firstElementFilterClass);
            }
            if(i==2){
                transferObject.transferObjectFilterClassOnCheck(i,secondElementFilterClass);
            }
            if(i==3){
                transferObject.transferObjectFilterClassOnCheck(i,thirdElementFilterClass);
            }
        }
    }




}
