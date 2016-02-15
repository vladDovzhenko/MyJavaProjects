package check.filter.diagonal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import verify.arguments.TransferObject;

/**
 * Created by Vlad on 08.02.2016.
 */
public class CheckFilterByNameDiagonal {
    WebDriver driver;
    TransferObject transferObject;
    @FindBy(xpath = ".//i[contains(text(),\"До 4\")]")
    public WebElement firstElementFilterDiagonal;

    @FindBy(xpath = ".//i[contains(text(),'4.5\" - 5\"')]")
    public WebElement secondElementFilterDiagonal;

    @FindBy(xpath = ".//i[contains(text(),'5.55\" - 6\"')]")
    public WebElement thirdElementFilterDiagonal;
    public CheckFilterByNameDiagonal(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



       public void addmisonObjectsFilterDiagonal(){
           transferObject=new TransferObject(driver);
        System.out.println("Checking the Filter(Diagonal):");
        for (int i=1;i<4;i++){

            if(i==1){
                transferObject.transferObjectFilterDiagonalOnCheck(i,firstElementFilterDiagonal);
            }
            if(i==2){
                transferObject.transferObjectFilterDiagonalOnCheck(i,secondElementFilterDiagonal);
            }
            if(i==3){
                transferObject.transferObjectFilterDiagonalOnCheck(i,thirdElementFilterDiagonal);
            }
        }
}
}
