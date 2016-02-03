package webDriver.Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.concurrent.TimeUnit;


/**
 * Created by Vlad on 31.01.2016.
 */
public class SimpleTest {
private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    boolean isElementPresent=false;
    private int indexPage=1;
    private StringBuffer verificationErrors = new StringBuffer();
    @BeforeClass
    public  void setUp()throws Exception{
        driver=new FirefoxDriver();
        driver.get(baseUrl = "https://www.google.com.ua/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void navigateToGoogle()throws Exception {
        driver.findElement(By.id("lst-ib")).clear();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("осциллограф");
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        while (isElementPresent!=true) {
            isElementPresent = isElementPresent(By.xpath(".//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]"));
            if (isElementPresent == true) {

                System.out.println("Information VIT.ua was on page:" + indexPage);
                screenShot();
            } else if (isElementPresent == false) {
                indexPage++;
                System.out.println("Navigating on page " + indexPage);
                try {
                    driver.findElement(By.xpath(".//*[@id='pnnext']/span[1]")).click();
                } catch (NoSuchElementException e) {
                    System.out.println("VIT.ua not found!");
                    return;
                }
            }
        }


    }
    private boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
    public void screenShot() {
        File screenshot = (File) ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(
                    "C:\\Selenium\\Screenshots\\Screen01.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}

