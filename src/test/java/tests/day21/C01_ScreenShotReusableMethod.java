package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test1() throws IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        //Sayfayı kapatınız
        //Driver.closeDriver();
    }
    @Test
    public void test02() throws IOException {
        //amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amznPage = new AmazonPage();
        //nutella aratınız
        amznPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);
        //arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("aramaSonucWE",amznPage.aramaSonucWE);


    }
}
