package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;


    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']" )
    public WebElement hotelManagement;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]" )
    public WebElement roomResevation;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']" )
    public WebElement addRoom;

    @FindBy(xpath = "//*[@id='IDUser']" )
    public WebElement idUser;

    @FindBy(xpath = "//*[@Class='bootbox-body']" )
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[text()='OK']" )
    public WebElement okButton;

}
