package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.test.pageobject.Page;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 04.02.2016.
 */
public class TestSearchGoogle {
    WebDriver driver;
    Page page;


    @BeforeTest
    public void setup(){
         driver=new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.google.com.ua/");
     }

    @Test
    public void navigateToGoogle()throws Exception{
        page=new Page(driver);
        page.textForInputField("осциллограф");
        page.additionsMethod();
    }


}
