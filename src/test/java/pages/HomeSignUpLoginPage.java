package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.ReusableMethods;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class HomeSignUpLoginPage extends ReusableMethods {
    public List<SelenideElement> homePageImages = $$("[class=\"girl img-responsive\"]");
    public SelenideElement signupLogin = $("[href=\"/login\"]");
    public SelenideElement name = $("[name=\"name\"]");
    public SelenideElement signupEmailBox = $("[data-qa=\"signup-email\"]");
    public SelenideElement signupButton = $("[action=\"/signup\"] [data-qa=\"signup-button\"]");
    public SelenideElement enterAccountInformationText = $(By.xpath("//b[.='Enter Account Information']"));
    public SelenideElement mrRadioButton = $("[id=\"id_gender1\"]");
    public SelenideElement password = $("[id=\"password\"]");
    public SelenideElement day = $("[id=\"days\"]");
    public SelenideElement month = $("[id=\"months\"]");
    public SelenideElement year = $("[id=\"years\"]");
    public SelenideElement newsLetter = $("[id=\"newsletter\"]");
    public SelenideElement offer = $("[id=\"optin\"]");
    public SelenideElement firstName = $("[id=\"first_name\"]");
    public SelenideElement lastName = $("[id=\"last_name\"]");
    public SelenideElement company = $("[id=\"company\"]");
    public SelenideElement address = $("[id=\"address1\"]");
    public SelenideElement address2 = $("[id=\"address2\"]");
    public SelenideElement country = $("[id=\"country\"]");
    public SelenideElement state = $("[id=\"state\"]");
    public SelenideElement city = $("[id=\"city\"]");
    public SelenideElement zipcode = $("[id=\"zipcode\"]");
    public SelenideElement mobileNumber = $("[id=\"mobile_number\"]");
    public SelenideElement createAccountButton = $("[data-qa=\"create-account\"]");
    public SelenideElement accountCreatedText = $(By.xpath("//b[.='Account Created!']"));
    public SelenideElement continueButton = $("[class=\"pull-right\"] [data-qa=\"continue-button\"]");
    public SelenideElement closeButton = $(By.xpath("//span[.='Close']"));
    public SelenideElement loggedIn = $(By.xpath("//*[text()=' Logged in as ']"));
    public SelenideElement deleteAccount = $("a[href=\"/delete_account\"]");


}
