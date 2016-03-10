package entrance.to.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 09.02.2016.
 */
public class AutoLogin {
    WebDriver driver;
    @FindBy(xpath = ".//*[@id='gmail-sign-in']")
    public WebElement gmailSignInButton;

    @FindBy(xpath = ".//*[@id='Email']")
    public WebElement emailField;

    @FindBy(xpath = ".//*[@id='next']")
    public  WebElement nextButton;

    @FindBy(xpath = ".//*[@id='Passwd']")
    public WebElement passwordField;

    @FindBy(xpath = ".//*[@id='signIn']")
    public WebElement signInButton;

    public AutoLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickSignInButton(){
        gmailSignInButton.click();
    }

    public void entranceEmailAndClickOnNextButton(String email){
        emailField.sendKeys(email);
        nextButton.click();
    }
    public void entrancePasswordAndClickOnSignInButton(String password){
      passwordField.sendKeys(password);
      signInButton.click();
    }


}
