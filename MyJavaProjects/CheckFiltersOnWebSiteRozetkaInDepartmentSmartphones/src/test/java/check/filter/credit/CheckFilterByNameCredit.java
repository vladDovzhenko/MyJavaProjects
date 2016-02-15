package check.filter.credit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import verify.arguments.ElementPresent;

/**
 * Created by Vlad on 08.02.2016.
 */
public class CheckFilterByNameCredit {
    WebDriver driver;
    ElementPresent el;
    public CheckFilterByNameCredit(WebDriver driver) {
    this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ".//i[contains(text(),'0% на 10 месяцев')]")
    public WebElement clickButton;
    By imgSearch=By.xpath(".//img[@title='Акционный кредит 0.01% на 10 месяцев!']");
    @FindBy( xpath=".//span[@class=\"g-i-more-link-text\"]")
    public WebElement con;
public void checkFilterCredit(){
    System.out.println("Checking the filter(0% on 10 months).");
    clickButton.click();
    helperIsElementPresent();
}
    private void helperIsElementPresent() {
        el=new ElementPresent(driver);
        boolean result;
        result = el.isElementPresent(By.xpath(".//h1[contains(text(),\"Мобильные телефоны, Беспроцентный кредит 0% на 10 месяцев\")]"));
        System.out.println("Verify header parameter(Interest-free credit):" + result);
        con.click();
        for (int k = 1;k<65 ; k++) { //search info in every product
                result=el.isElementPresent(By.xpath("//div[@class = 'g-i-tile g-i-tile-catalog'][" + k + "]//img[@title='Акционный кредит 0.01% на 10 месяцев!']"));
                System.out.println(k+"."+result);

        }
    }

}
