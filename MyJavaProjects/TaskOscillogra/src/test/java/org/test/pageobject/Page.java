package org.test.pageobject;
import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.String;
import java.awt.*;

/**
 * Created by Vlad on 04.02.2016.
 */
public class Page {
    WebDriver driver;
    @FindBy(name = "q")
    WebElement inputFieldGoogle;

    @FindBy(xpath = ".//*[@id='sblsbb']/button")
    WebElement searchButton;
    FindElement findElement;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
    }

    public void enterTextInInputField(String text) {
        inputFieldGoogle.sendKeys( text );
    }

    public void clickOnSearchButton() {
        findElement = new FindElement( driver );
        searchButton.click();
    }

    public void additionsMethod() {
        findElement.findElemementByPages();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement( by );
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void textForInputField(String text) {
        this.enterTextInInputField( text );
        this.clickOnSearchButton();
    }

}
