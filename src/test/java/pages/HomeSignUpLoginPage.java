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
    public SelenideElement loggedIn = $(By.xpath("//*[text()=' Logged in as ']"));
    public SelenideElement deleteAccount = $("a[href=\"/delete_account\"]");
    public SelenideElement loginEmailBox = $("[data-qa=\"login-email\"]");
    public SelenideElement passwordLogin = $("[data-qa=\"login-password\"]");
    public SelenideElement loginButton = $("[data-qa=\"login-button\"]");
    public SelenideElement logoutButton = $("[href=\"/logout\"]");
    public SelenideElement contactUsButton = $("[href=\"/contact_us\"]");
    public SelenideElement contactUsEmail = $("[name=\"email\"]");
    public SelenideElement subject = $("[name=\"subject\"]");
    public SelenideElement message = $("[id=\"message\"]");
    public SelenideElement chooseFile = $("[name=\"upload_file\"]");
    public SelenideElement submitButton = $("[name=\"submit\"]");
    public SelenideElement homeButton = $("[class=\"btn btn-success\"] [class=\"fa fa-angle-double-left\"]");
    public SelenideElement xCloseButton = $("[class=\"ns-dpaeu-e-7\"],[viewBox=\"0 0 48 48\"],[d=\"M38 12.83L35.17 10 24 21.17 12.83 10 10 12.83 21.17 24 10 35.17 12.83 38 24 26.83 35.17 38 38 35.17 26.83 24z\"]");
    public SelenideElement testCasesButton = $("[href=\"/test_cases\"]");
    public SelenideElement testCasesHeader = $(By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b[text()='Test Cases']"));
    public SelenideElement advertiseClose = $(By.xpath("//*[@class=\"ns-i0sza-e-7\"][.='Close']"));



}
