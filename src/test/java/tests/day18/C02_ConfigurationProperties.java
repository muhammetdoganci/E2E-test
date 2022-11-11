package tests.day18;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

@Listeners(utilities.Listeners.class)
public class C02_ConfigurationProperties {


    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
}
