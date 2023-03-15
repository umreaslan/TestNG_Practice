package tests;

import ieEnstitutu.QualityPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class dataProvider {

    QualityPage qualityPage=new QualityPage();
    @DataProvider
    public static Object[][] gonderilecekMail(){
        Object[][] gonderilecekMailvePassword={{"nevzat","1234"}};
        return gonderilecekMailvePassword;
    }

    @Test(dataProvider = "gonderilecekMail")
    public void qualityTest(String mail,String password){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        qualityPage.cookies.click();
        qualityPage.looginButton.click();





        }
}
