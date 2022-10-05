package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PageClassFacebookTest {

    @Test
    public void test1(){
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.login.click();
        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapişmadi.isDisplayed());


    }
}
