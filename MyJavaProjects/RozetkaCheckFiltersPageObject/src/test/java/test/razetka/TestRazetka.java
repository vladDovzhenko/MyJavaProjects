package test.razetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.CheckFilters;
import pages.RazetkaPageObject;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 05.02.2016.
 */
public class TestRazetka {
    WebDriver driver;
    RazetkaPageObject razetka;
    CheckFilters checkFilters;

    @BeforeTest
    public void setUp(){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua/");

    }

    @Test
    public void checTheFiltersRazetka(){
        razetka=new RazetkaPageObject(driver);
        checkFilters=new CheckFilters(driver);
        razetka.textForInputField("смартфоны");
        checkFilters.admissionObject();

    }
}
