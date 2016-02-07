package verify.arguments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 06.02.2016.
 */
public class HelperForCheckFilters {
WebDriver driver;
    ElementPresent el;
    @FindBy(xpath = ".//a[contains(text(),\"Сбросить\")]")
    public WebElement clear;
    public HelperForCheckFilters(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void checkFilterByNameClass(int i){
        boolean win;
        el=new ElementPresent(driver);
        if(i==1) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Акционные предложения Мобильные телефоны \")]"));
            System.out.println (i + ")Check for(promotional offers):" + win);
            resetAll();
        }
        if(i==2) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Две SIM-карты Мобильные телефоны \")]"));
            System.out.println (i + ")Check for(Two SIM cards):" + win);
            resetAll();
        }
        if(i==3) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Флагманские смартфоны\")]"));
            System.out.println (i + ")Check for(Flagships)" + win);
            resetAll();
        }

    }
    public void checkFilterByNameManufacturer(int i){
        boolean win;
        el=new ElementPresent(driver);
        if(i==1) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Acer\")]"));
            System.out.println (i + ")Check for(Acer):" + win);
            resetAll();
        }
        if(i==2) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Asus\")]"));
            System.out.println (i + ")Check for(Asus):" + win);
            resetAll();
        }
        if(i==3) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Fly\")]"));
            System.out.println (i + ")Check for(Fly)" + win);
            resetAll();
        }
        if(i==4) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Impression\")]"));
            System.out.println (i + ")Check for(Impression):" + win);
            resetAll();
        }
        if(i==5) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны LG\")]"));
            System.out.println (i + ")Check for(LG):" + win);
            resetAll();
        }
        if(i==6) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Philips\")]"));
            System.out.println (i + ")Check for(Philips)" + win);
            resetAll();
        }
        if(i==7) {
            win= el.isElementPresent (By.xpath (".//h1[contains(text(),\"Мобильные телефоны Xiaomi\")]"));
            System.out.println (i + ")Check for(Xiaomi)" + win);
            resetAll();
        }

    }
    public void resetAll(){
        clear.click();
    }
}
