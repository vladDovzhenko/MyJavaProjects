package letter.creation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by Vlad on 09.02.2016.
 */
public class LetterCreation {
WebDriver driver;
    @FindBy(xpath = ".//*[@class='z0']/div")public WebElement writeButton;
    @FindBy(xpath = "//form[1]//textarea[1]")public WebElement inputFieldRecipient;
    @FindBy(xpath = ".//div[@class='aoD az6']//input[@class='aoT']")public WebElement inputFieldSubject;
    @FindBy(xpath = ".//div[@class=\"Am Al editable LW-avf\"]")public  WebElement inputFieldBody;
    @FindBy(xpath = ".//div[@class='a1 aaA aMZ']")public WebElement attachFileButton;
    @FindBy(xpath = "//div[text()=\"Отправить\"]")public WebElement sendButton;
    public LetterCreation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnWriteButton(){
        writeButton.click();
    }

    public void addInformInInputFieldRecipient(String recipient){
        inputFieldRecipient.click();
      inputFieldRecipient.sendKeys(recipient);
    }

    public void addInformInInputFieldSubject(String subject){
        inputFieldSubject.click();
      inputFieldSubject.sendKeys(subject);
    }

    public void addInformInInputFieldBody(String body){
        inputFieldBody.click();
      inputFieldBody.sendKeys(body);
    }

    public void attachFile(String path) throws IOException, AWTException, InterruptedException {
        attachFileButton.click();
        StringSelection ss = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(5000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
    }

public void clickOnSendButton(){
 sendButton.click();
}


}
