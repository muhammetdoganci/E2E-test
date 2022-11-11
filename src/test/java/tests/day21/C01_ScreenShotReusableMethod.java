package tests.day21;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.log4J.Log4JTest1;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    private static Logger logger = LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());
    @Test
    public void test1() throws IOException {

        logger.info("Hepsiburada sitesine gidilir");
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Ve sayfanın resmini alınız
        logger.info("Ekran goruntusu alir");
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
