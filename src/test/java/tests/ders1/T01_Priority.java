package tests.ders1;

import org.testng.annotations.Test;
import utilities.Driver;


public class T01_Priority {


    @Test
    public  void amazonTesti(){
        Driver.getDriver().get("https://www.amazon.com");



    }
}
