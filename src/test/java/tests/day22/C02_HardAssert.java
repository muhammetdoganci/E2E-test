package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_HardAssert extends TestBaseCross {
    /*
     Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.  Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
    Hard Assertions'da herhangi bir assertion failed olursa, test method'un çalışmasını durdurur ve kalan kodları yürütmez.(stop execution)

    Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız, Herhangi bir hata verdiğinde test methodu
    çalışmaya devam eder, en sonra rapor verir.    baslangıc  SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();

     */

    @Test
    public void test() throws Exception {
        /*
        1-amazon anasayfaya gidin
        2-title in Amazon içerdigini test edin
        3-arama kutusnun erişilebilir oldugunu tets edin
        4-arama kutusuna Nuella yazıp aratın
        5-arama yapıldıgını test edin
        6-arama sonucunun Nutella içerdigini test edin

         */

        //1
        driver.get("https://www.amazon.com");
        //2
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //3
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isEnabled());
        //4
        searchBox.sendKeys("Nutella" + Keys.ENTER);
        //5
        WebElement sonuc = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());
        //6
        Assert.assertTrue(sonuc.getText().contains("Nutella"));



    }
}

