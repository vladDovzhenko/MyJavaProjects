package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vlad on 06.02.2016.
 */
public class HelperForCheckFilters {
    WebDriver driver;
    ElementPresent elementPresent;
    public HelperForCheckFilters(WebDriver driver) {
        this.driver=driver;
    }

    public void ObjectOnCheck(int i){
        boolean b;
        elementPresent =new ElementPresent( driver );
        if(i==1) {
            b = elementPresent.isElementPresent (By.xpath (".//a[contains(text(),\"Флагманы\")]"));
            System.out.println (i + ")" + b);
        }
        if(i==2) {
            b = elementPresent.isElementPresent (By.xpath (".//h1[contains(text(),\"Карты памяти\")]"));
            System.out.println (i + ")" + b);
        }
        if(i==3) {
            b = elementPresent.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Apple\")]"));
            System.out.println (i + ")" + b);
        }
        if(i==4) {
            b = elementPresent.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Gigabyte\")]"));
            System.out.println (i + ")" + b);
        }
        if(i==5) {
            b = elementPresent.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Lenovo\")]"));
            System.out.println (i + ")" + b);
        }
        if(i==6) {
            b = elementPresent.isElementPresent (By.xpath (".//a[contains(text(),\"Мобильные телефоны Prestigio\")]"));
            System.out.println (i + ")" + b);
        }
    }
}
