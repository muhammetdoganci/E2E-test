package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */
    @Test
    public void test01(){
        extentTest = extentReports.createTest("PozitifTest","Geçerli kullanici adi ve sifre ile giris yapildi" );
       //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
        BrcPage brcPage = new BrcPage();
       //-login butonuna bas
        brcPage.brclogin.click();
        extentTest.info("Login butonuna basildi");
       //-test data user email: customer@bluerentalcars.com ,
        brcPage.email.sendKeys("customer@bluerentalcars.com");
       //-test data password : 12345 dataları girip login e basın
        //-login butonuna tiklayin
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici email ve passWord girildi");
        extentTest.info("İkinci login butonuna basildi");
       //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
       String actualUserName = brcPage.basariliGiris.getText();
       String expectedUserName = "John Walker";
       Assert.assertEquals(expectedUserName,actualUserName);
       extentTest.pass("sayfaya basarili sekilde girildi");

    }
}
