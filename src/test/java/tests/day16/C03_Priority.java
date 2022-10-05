package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    /*
    testlerimizi calistiriken istedigimiz siraya gore calismasini istersek
    priority methodunu kullaniriz
    priority kullanmazsak default olarak 0 dır. ilk o calisir
     */
    @Test(priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test // priority methodu yazmazsak sistem default olarak 0 kabul eder
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }
    @Test(priority = -1, groups = ("grup1"))
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
