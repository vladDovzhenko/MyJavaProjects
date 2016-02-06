package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 05.02.2016.
 */
public class CheckFilters{
    WebDriver driver;
    HelperForCheckFilters helper;
    @FindBy(xpath = ".//a[contains(text(),\"Смартфоны\")]")
    public WebElement firstElementFirstFilter;
    @FindBy(xpath = ".//a[contains(text(),\"Карты памяти\")]")
    public WebElement secondElementFirstFilter;
    @FindBy(xpath = ".//a[contains(text(),\"Apple\")]")
    public WebElement firstElementSecondFilter;
    @FindBy(xpath = ".//*[@id='menu_categories_left']/li[2]/ul/li[3]/a")
    public WebElement secondElementSecondFilter;
    @FindBy(xpath = ".//a[contains(text(),\"Lenovo\")]")
    public WebElement thirdElementSecondFilter;
    @FindBy(xpath = ".//a[contains(text(),\"Prestigio\")]")
    public WebElement fourthElementSecondFilter;
    public CheckFilters(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
public void admissionObject(){
    System.out.println("Check Filters:");
    for(int i=1;i<7;i++){
        if(i==1){
          transferObjectOnCheck(i,firstElementFirstFilter);
        }
        if(i==2){
            backToPage ();
            transferObjectOnCheck(i,secondElementFirstFilter);
        }
        if(i==3){
            backToPage ();
            transferObjectOnCheck(i,firstElementSecondFilter);
        }
        if(i==4){
            backToPage ();
            transferObjectOnCheck(i,secondElementSecondFilter);
        }
        if(i==5){
            backToPage ();
            transferObjectOnCheck(i,thirdElementSecondFilter);
        }
        if(i==6){
            backToPage ();
            transferObjectOnCheck(i,fourthElementSecondFilter);
        }
    }
}
    public void transferObjectOnCheck(int i,WebElement element){
        helper=new HelperForCheckFilters ( driver);
        element.click();
        helper.ObjectOnCheck (i);
    }
    public void backToPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get ("http://rozetka.com.ua/mobile-phones/c80003/#search_text=%D1%81%D0%BC%D0%B0%D1%80%D1%82%D1%84%D0%BE%D0%BD%D1%8B");
    }


}
