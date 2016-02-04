package org.test.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vlad on 04.02.2016.
 */
public class FindElement {
    WebDriver driver;
    int indexPage = 1;
    By elementSearch = By.xpath("//cite[contains(text(),\"vit.ua\")]");
    By nextButton=By.xpath(".//*[@id='pnnext']/span[1]");
    public FindElement(WebDriver driver){
        this.driver = driver;
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
                    driver.findElement(nextButton).click();
                } catch (NoSuchElementException e) {
                    System.out.println("VIT.ua not found!");
                }
            }
        }

    }
}
