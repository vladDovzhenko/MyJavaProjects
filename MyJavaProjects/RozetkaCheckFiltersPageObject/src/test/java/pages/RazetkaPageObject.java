package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 05.02.2016.
 */
public class RazetkaPageObject {
    WebDriver driver;
    @FindBy(name="text")public WebElement inputField;
    @FindBy(xpath = ".//*[@id='search']//button")public WebElement searchButton;
    public RazetkaPageObject(WebDriver driver){
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void enterTextInInputField(String text) {
        inputField.sendKeys(text);
    }
    public void clickOnSearchButton() {searchButton.click();}

    public void textForInputField(String text) {
        this.enterTextInInputField(text);
        this.clickOnSearchButton();
    }


}
