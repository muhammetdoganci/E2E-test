package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
}
