package org.test.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
/**
 * Created by Vlad on 04.02.2016.
 */
public class Page {
    WebDriver driver;
    By inputFieldGoogle=By.name("q");
    By searchButton=By.xpath(".//*[@id='sblsbb']/button");
    FindElement findElement;
    public Page(WebDriver driver){
        this.driver = driver;
    }

    public void enterTextInInputField(String text){
        driver.findElement(inputFieldGoogle).sendKeys(text);
    }
    public void clickOnSearchButton(){
        findElement=new FindElement(driver);
        driver.findElement(searchButton).click();
}
    public void additionsMethod(){
        findElement.findElemementByPages();
    }
    public boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
    public void textForInputField(String text){
        this.enterTextInInputField(text);
        this.clickOnSearchButton();
    }
}
