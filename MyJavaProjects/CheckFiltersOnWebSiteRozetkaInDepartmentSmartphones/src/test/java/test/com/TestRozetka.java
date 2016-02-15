package test.com;

import check.filter.credit.CheckFilterByNameCredit;
import check.filter.diagonal.CheckFilterByNameDiagonal;
import helper.test.com.CheckFilterByNameClass;
import helper.test.com.CheckFilterByNameManufacturer;
import check.filter.price.CheckFilterByNamePrice;
import helper.test.com.HelperMethodSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 06.02.2016.
 */
public class TestRozetka {
    WebDriver driver;
    CheckFilterByNameManufacturer filterByNameManufacturer;
    CheckFilterByNameClass filterByNameClass;
    HelperMethodSetUp helper;
    CheckFilterByNamePrice filterByNamePrice;
    CheckFilterByNameCredit filterByNameCredit;
    CheckFilterByNameDiagonal filterByNameDiagonal;
    @BeforeTest
    public void setUp(){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua/");
    }
    @Test
    public void guide(){
        helper=new HelperMethodSetUp(driver);
        filterByNameClass=new CheckFilterByNameClass(driver);
        filterByNameManufacturer=new CheckFilterByNameManufacturer(driver);
        filterByNamePrice=new CheckFilterByNamePrice(driver);
        filterByNameCredit=new CheckFilterByNameCredit(driver);
        filterByNameDiagonal=new CheckFilterByNameDiagonal(driver);
        helper.textForInputField("смартфоны");
        filterByNameClass.addmisonObjectsFilterClass();
        helper.clickOnTurnFilterClassButton();
        filterByNameManufacturer.addmisonObjectsFilterManufacturer();
        helper.clickOnTurnFilterManufacturerButton();
        filterByNamePrice.valueTransfer();
        filterByNameCredit.checkFilterCredit();
        filterByNameDiagonal.addmisonObjectsFilterDiagonal();

    }


}
