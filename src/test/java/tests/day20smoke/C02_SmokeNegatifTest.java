package tests.day20smoke;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {
    @Test
    public void yanlisKullanici() { //1. senaryo yanlis kullanici dogru sifre

            // https://www.hotelmycamp.com/ adresine git
            Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

            //login butonuna bas
            HmcPage hmcPage = new HmcPage();
            hmcPage.login.click();

            //test data username: manager1 , test data password : Manager1!
            hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("passWord"))
                    .sendKeys(Keys.ENTER).perform();

            //Degerleri girildiginde sayfaya girilemedigini test et
            Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
            //sayfayi kapatiniz
        Driver.closeDriver();
        }


    @Test
    public void yanlisSifre() { //2. senaryo dogru kullanici yanlis sifre

        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

        //login butonuna bas
        HmcPage hmcPage = new HmcPage();
        hmcPage.login.click();

        //test data username: manager1 , test data password : manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //sayfayi kapatiniz
        Driver.closeDriver();

    }
    @Test
    public void yanlisKullaniciSifre(){//3. senaryo yanlis kullanici yanlış sifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

        //login butonuna bas
        HmcPage hmcPage = new HmcPage();
        hmcPage.login.click();

        //test data username: manager1 , test data password : manager1!
        hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //sayfayi kapatiniz
        Driver.closeDriver();

    }
}


