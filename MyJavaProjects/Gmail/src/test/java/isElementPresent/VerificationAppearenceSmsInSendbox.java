package isElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Vlad on 10.02.2016.
 */
public class VerificationAppearenceSmsInSendbox {
    WebDriver driver;
    VerifyElementPresent verifyElementPresent;
    @FindBy(xpath = ".//a[text()=\"Отправленные\"]")
    public WebElement sentMailButton;
    boolean elemPresent=false;

    public VerificationAppearenceSmsInSendbox(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSentMail(){
      sentMailButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),\"Письмо отправлено.\")]")));
    }

    public void returnValueIsElementPresent(By elementSearch){
        verifyElementPresent=new VerifyElementPresent(driver);
        elemPresent=verifyElementPresent.isElementPresent(elementSearch);
        System.out.println(elemPresent);
    }

}
