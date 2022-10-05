package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C04_DepensOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1(){
        //amazon ana sayfasına gidelim
        driver.get("https://Wamazon1.com");//test1 failed olduğu için test2 ve test3 kod yazımı doğru olsa bile
                                            //dependsOnMethods methoduyla test1 e bağlı olan methodların kontrolune bakmaz
    }
    @Test (dependsOnMethods = "test1")
    public void test2(){
        //nutella aratalim
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).
                sendKeys("Nutella", Keys.ENTER);
    }
    @Test (dependsOnMethods = "test2")
    public void test3(){
        //sonuc yazisinin amazon icerdigini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}
