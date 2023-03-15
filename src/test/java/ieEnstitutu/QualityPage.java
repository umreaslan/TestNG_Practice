package ieEnstitutu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityPage {

    public  QualityPage (){


        QualityPage qualityPage=new QualityPage();
        PageFactory.initElements(Driver.getDriver(),this);

        
    }
    @FindBy(xpath = "//*[text()='Accept']")
    public  WebElement cookies;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement looginButton;











}
