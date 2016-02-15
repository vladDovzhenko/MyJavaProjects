package helper.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import verify.arguments.ElementPresent;
import verify.arguments.TransferObject;

/**
 * Created by Vlad on 06.02.2016.
 */
public class CheckFilterByNameManufacturer {
    WebDriver driver;
    TransferObject transferObject;
ElementPresent el;
    @FindBy(xpath = ".//i[contains(text(),\"Acer\")]")
    public WebElement firstElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"Asus\")]")
    public WebElement secondElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"Fly\")]")
    public WebElement thirdElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"Impression\")]")
    public WebElement fourthElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"LG\")]")
    public WebElement fifthElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"Philips\")]")
    public WebElement sixthElementFilterManufacture;

    @FindBy(xpath = ".//i[contains(text(),\"Xiaomi\")]")
    public WebElement seventhElementFilterManufacture;

    public CheckFilterByNameManufacturer(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
public void addmisonObjectsFilterManufacturer() {
    transferObject = new TransferObject(driver);
    System.out.println("Checking the Filter(Manufacturer):");
    for (int i = 1; i < 8; i++) {
        if (i == 1) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, firstElementFilterManufacture);
        }
        if (i == 2) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, secondElementFilterManufacture);
        }
        if (i == 3) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, thirdElementFilterManufacture);
        }
        if (i == 4) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, fourthElementFilterManufacture);
        }
        if (i == 5) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, fifthElementFilterManufacture);
        }
        if (i == 6) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, sixthElementFilterManufacture);
        }
        if (i == 7) {
            transferObject.transferObjectFilterManufacturerOnCheck(i, seventhElementFilterManufacture);
        }

    }
    }


}
