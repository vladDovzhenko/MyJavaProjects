package org.test.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 04.02.2016.
 */
public class FindElement {
    WebDriver driver;
    int indexPage = 1;

    By elementSearch = By.xpath("//cite[contains(text(),\"vit.ua\")]");

    @FindBy(xpath = ".//*[@id='pnnext']/span[1]")
    WebElement nextButton;

    public FindElement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findElemementByPages() {
        boolean elemPresent = false;
        Page p=new Page(driver);
        while (elemPresent != true) {
            elemPresent = p.isElementPresent(elementSearch);
            if (elemPresent == true) {
                System.out.println("Information VIT.ua was on page:" + indexPage);
            } else if (elemPresent == false) {
                indexPage++;
                System.out.println("Navigating on page " + indexPage);
                try {
                    nextButton.click();
                } catch (NoSuchElementException e) {
                    System.out.println("VIT.ua not found!");
                }
            }
        }

    }
}
