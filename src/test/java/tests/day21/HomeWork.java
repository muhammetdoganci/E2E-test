package tests.day21;

import org.testng.annotations.Test;
import pages.HbPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomeWork {
    @Test
    public void test1(){
        //hepsiburada.com sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hbUrl"));
        HbPage hbPage = new HbPage (Driver.getDriver());
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        hbPage.elekronik.click();
        //her linkten sonra o sayfaya gittigimizi test edelim ve o sayfanın resmini alalım
        //sayfayı kapatalım
    }
}
