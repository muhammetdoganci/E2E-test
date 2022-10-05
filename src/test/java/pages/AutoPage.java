package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {
    public AutoPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//*[@class='logo pull-left']")
    public WebElement anasayfa;

    @FindBy (xpath = "(//*[@class='fa fa-shopping-cart'])[1]")
    public WebElement sepet;

    @FindBy (xpath = "//*[text()='Subscription']")
    public WebElement abonelik;

    @FindBy (xpath = "//*[@id='susbscribe_email']")
    public WebElement email;

    @FindBy (xpath = "//*[@class='fa fa-arrow-circle-o-right']")
    public WebElement ok;

    @FindBy (xpath = "//*[text()='You have been successfully subscribed!']")
    public WebElement girisBasarili;

    @FindBy (xpath = "//*[text()=' Test Cases']")
    public WebElement testVakalari;

    @FindBy (xpath = "//*[text()='Test Cases']")
    public WebElement testVakalariBolumu;


}
