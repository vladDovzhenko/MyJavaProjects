package helper.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vlad on 06.02.2016.
 */
public class HelperMethodSetUp {
    WebDriver driver;

    @FindBy(name="text")public WebElement inputField;
    @FindBy(xpath = ".//*[@id='search']//button")
    public WebElement searchButton;
    @FindBy(xpath = ".//a[@class=\"pab-h2-link\"]")
    public WebElement moveOnLink;

    public HelperMethodSetUp(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void enterTextInInputField(String text) {
        inputField.sendKeys(text);
    }
    public void clickOnSearchButton() {searchButton.click();}
    public void clickOnHref(){moveOnLink.click();}
    public void textForInputField(String text) {
        this.enterTextInInputField(text);
        this.clickOnSearchButton();
        this.clickOnHref();
    }

}
