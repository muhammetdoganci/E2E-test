package tests.calismalar;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Soru2 {
    @Test
    public void test2(){
        // 1. Tarayıcıyı başlatın
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("autUrl"));
        AutoPage autoPage = new AutoPage();
        SoftAssert softAssert = new SoftAssert();
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        softAssert.assertTrue(autoPage.anasayfa.isDisplayed());
        // 4. 'Test Vakaları' düğmesine tıklayın
        autoPage.testVakalari.click();
        // 5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın
        softAssert.assertTrue(autoPage.testVakalariBolumu.isDisplayed());
        softAssert.assertAll();

    }
}
