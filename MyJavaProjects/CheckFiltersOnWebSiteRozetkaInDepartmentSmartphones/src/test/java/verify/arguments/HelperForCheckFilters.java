package verify.arguments;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkFilterByNameClass(int i) {
        boolean win;
        boolean winner;
        el = new ElementPresent(driver);
        if (i == 1) {
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Акционные предложения Мобильные телефоны \")]"));
            System.out.println(i + ")Verify header parameter(promotional offers):" + win);
            resetAll();
        }
        if (i == 2) {
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Две SIM-карты Мобильные телефоны \")]"));
            System.out.println(i + ")Verify header parameter(Two SIM cards):" + win);
            resetAll();
        }
        if (i == 3) {
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Флагманские смартфоны\")]"));
            System.out.println(i + ")Verify header parameter(Flagships)" + win);
            resetAll();
        }


    }

    public void checkFilterByNameManufacturer(int i) {
        boolean win;
        el = new ElementPresent(driver);
        if (i == 1) {
            String a = "Acer";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Acer\")]"));
            System.out.println(i + ")Verify header parameter(Acer):" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 2) {
            String a="Asus";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Asus\")]"));
            System.out.println(i + ")Verify header parameter(Asus):" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 3) {
            String a="Fly";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Fly\")]"));
            System.out.println(i + ")Verify header parameter(Fly)" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 4) {
            String a="Impression";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Impression\")]"));
            System.out.println(i + ")Verify header parameter(Impression):" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 5) {
            String a="LG";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны LG\")]"));
            System.out.println(i + ")Verify header parameter(LG):" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 6) {
            String a="Philips";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Philips\")]"));
            System.out.println(i + ")Verify header parameter(Philips)" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }
        if (i == 7) {
            String a="Xiaomi";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны Xiaomi\")]"));
            System.out.println(i + ")Verify header parameter(Xiaomi)" + win);
            isTextPresentInFilterManufacturer(a);
            resetAll();
        }

    }
    public void checkFilterByNameDiagonal(int i) {
        boolean win;
        boolean winner;
        el = new ElementPresent(driver);
        if (i == 1) {
            String a="4\"";
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны, Диагональ До 4\")]"));
            System.out.println(i + ")Verify header parameter(diagonal to 4):" + win);
            resetAll();
        }
        if (i == 2) {
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),'Мобильные телефоны, Диагональ 4.5\" - 5\')]"));
            System.out.println(i + ")Verify header parameter(diagonal 4.5-5):" + win);
            resetAll();
        }
        if (i == 3) {
            win = el.isElementPresent(By.xpath(".//h1[contains(text(),'Мобильные телефоны, Диагональ 5.55\" - 6\"')]"));
            System.out.println(i + ")Verify header parameter(diagonal 5.55-6)" + win);
            resetAll();
        }


    }

    public void resetAll() {
        clear.click();
    }

    private void isTextPresentInFilterManufacturer(String a) {
        System.out.println("Search info in every product:");
        boolean result;
        for (int k = 1; ; k++) { //search info in every product
            try {
                result=driver.findElement(By.xpath("//div[@class = 'g-i-tile g-i-tile-catalog'][" + k + "]//div[@class = 'g-i-tile-i-title clearfix']")).getText().contains(a);
                System.out.println(k+"."+result);
            } catch (NoSuchElementException e) {
                result=false;
                System.out.println(k+"."+result);
                break;
            }
        }
    }
    private void isTextPresentInFilterDiagonal(String a) {
        System.out.println("Search info in every product:");
        boolean result;
        for (int k = 1; ; k++) { //search info in every product
            try {
                result=driver.findElement(By.xpath("//div[@class = 'g-i-tile g-i-tile-catalog'][" + k + "]//ul[@class='g-i-tile-short-detail']")).getText().contains(a);
                System.out.println(k+"."+result);
            } catch (NoSuchElementException e) {
                result=false;
                System.out.println(k+"."+result);
                break;
            }
        }
    }

}
