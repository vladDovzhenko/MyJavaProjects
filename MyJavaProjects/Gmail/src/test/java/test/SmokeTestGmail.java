package test;

import entrance.to.gmail.AutoLogin;
import isElementPresent.VerificationAppearenceSmsInSendbox;
import isElementPresent.VerifyElementPresent;
import letter.creation.LetterCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 09.02.2016.
 */
public class SmokeTestGmail {
    WebDriver driver;
    AutoLogin login;
    LetterCreation letterCreation;
    VerificationAppearenceSmsInSendbox verificationAppearenceSmsInSendbox;
    VerifyElementPresent elementPresent;
    By elementSearch = By.xpath(".//span[contains(text(),\"Test result\")]");
    @FindBy(xpath = ".//span[@class=\"gb_Za gbii\"]")
    public WebElement profileButton;
    @FindBy(xpath = ".//*[@id='gb_71']")
    public WebElement exitButton;
    String baseURL="https://www.google.com/intl/ru/mail/help/about.html";
    String email="dovjenko.v@gmail.com";
    String password="Uguneg23";
    String recipient="korolyva.j.v@gmail.com";
    String subject="Test result";
    String body="Hello!My name is Vlad.I'm very bad programmer";
    String path="C:\\Screenshot_1.png";

    @BeforeTest
    public void setUp(){
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
    @Test
    public void navigate() throws AWTException, InterruptedException, IOException {
        login=new AutoLogin(driver);
        letterCreation=new LetterCreation(driver);
        verificationAppearenceSmsInSendbox=new VerificationAppearenceSmsInSendbox(driver);
        elementPresent=new VerifyElementPresent(driver);
        login.clickSignInButton();
        login.entranceEmailAndClickOnNextButton(email);
        login.entrancePasswordAndClickOnSignInButton(password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        letterCreation.clickOnWriteButton();
        letterCreation.addInformInInputFieldRecipient(recipient);
        letterCreation.addInformInInputFieldSubject(subject);
        letterCreation.addInformInInputFieldBody(body);
        letterCreation.attachFile(path);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        letterCreation.clickOnSendButton();
        verificationAppearenceSmsInSendbox.clickOnSentMail();
        verificationAppearenceSmsInSendbox.returnValueIsElementPresent(elementSearch);


    }
}
