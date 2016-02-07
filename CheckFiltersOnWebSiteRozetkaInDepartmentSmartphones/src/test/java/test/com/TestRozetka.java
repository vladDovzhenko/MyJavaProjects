package test.com;

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
        helper.textForInputField("смартфоны");
        filterByNameClass.addmisonObjectsFilterClass();
        //filterByNameManufacturer.addmisonObjectsFilterManufacturer();
        //filterByNamePrice.valueTransfer();

    }


}
