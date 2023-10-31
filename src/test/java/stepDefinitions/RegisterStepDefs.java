package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration.*;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomeSignUpLoginPage;
import utils.ConfigReader;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegisterStepDefs extends HomeSignUpLoginPage {
    @Given("Navigate to url {string}")
    public void navigateToUrl(String endPoint) {
        Configuration.timeout = 60000;
        open(ConfigReader.getProperty("URL") + endPoint);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        homePageImages.get(0).shouldBe(visible);
    }

    @And("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        signupLogin.click();
    }

    @And("Verify text {string} is visible")
    public void verifyTextIsVisible(String text) {
        $(byText(text)).shouldBe(visible);
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        faker = new Faker();
        name.setValue(faker.name().firstName());
        signupEmailBox.setValue(faker.internet().emailAddress());
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        signupButton.click();
    }

    @And("Verify text ENTER ACCOUNT INFORMATION is visible")
    public void verifyTextENTERACCOUNTINFORMATIONIsVisible() {
        enterAccountInformationText.shouldBe(visible);
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        mrRadioButton.scrollTo().click();
        password.scrollTo().setValue("Aa123");
        day.selectOption(1);
        month.selectOption(1);
        year.selectOption(1);
    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        newsLetter.scrollTo().click();


    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        offer.scrollTo().click();
    }

    @And("Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressTwoCountryStateCityZipcodeMobileNumber() {
        faker = new Faker();
//        firstName.setValue(faker.name().firstName()).pressTab().scrollTo().pressTab()
//                .setValue(faker.name().lastName()).pressTab().scrollTo().pressTab()
//                .setValue(faker.company().name()).pressTab().scrollTo().pressTab()
//                .setValue(faker.address().fullAddress()).pressTab().scrollTo().pressTab()
//                .setValue(faker.address().secondaryAddress()).pressTab();

        firstName.setValue(faker.name().firstName()).scrollTo();
        lastName.setValue(faker.name().lastName()).scrollTo();
        company.setValue(faker.company().name()).scrollTo();
        address.setValue(faker.address().fullAddress()).scrollTo();
        address2.setValue(faker.address().secondaryAddress());

        country.selectOption(1);

        state.setValue(faker.address().cityName()).pressTab();
        city.setValue(faker.address().cityName()).pressTab();
        zipcode.setValue(faker.address().zipCode()).pressTab();
        mobileNumber.setValue(faker.phoneNumber().cellPhone());


    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        createAccountButton.scrollTo().click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        accountCreatedText.shouldBe(visible);
    }


    @And("Click Continue button")
    public void clickContinueButton() {
        continueButton.click();
        refresh();
        if (continueButton.isDisplayed()) continueButton.click();

    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        loggedIn.shouldBe(visible);
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        jsclick(deleteAccount);

    }

    @And("Verify that {string} is visible and click Continue button")
    public void verifyThatIsVisibleAndClickContinueButton(String arg0) {
        Assert.assertTrue(WebDriverRunner.source().contains(arg0));
        continueButton.click();
    }

    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        faker = new Faker();
        name.setValue(faker.name().fullName());
        signupEmailBox.setValue(ConfigReader.getProperty("email"));
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        loginEmailBox.setValue(ConfigReader.getProperty("email"));
        passwordLogin.setValue(ConfigReader.getProperty("password"));
    }

    @And("Click Login button")
    public void clickLoginButton() {
        loginButton.click();
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        loginEmailBox.setValue(ConfigReader.getProperty("incorrectEmail"));
        passwordLogin.setValue(ConfigReader.getProperty("incorrectPassword"));
    }

    @And("Click Logout button")
    public void clickLogoutButton() {
        logoutButton.click();
    }

    @And("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        signupLogin.shouldHave(visible);
    }

    @And("Click text on {string} button")
    public void clickTextOnButton(String text) {
        $(byText(text)).click();
    }

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        contactUsButton.click();
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        faker = new Faker();
        contactUsEmail.setValue(faker.internet().emailAddress());
        name.setValue(faker.name().fullName());
        subject.setValue(faker.shakespeare().asYouLikeItQuote());
        message.setValue(faker.leagueOfLegends().masteries());
    }

    @And("Upload file")
    public void uploadFile() {
//        String relativeFilePath = System.getProperty("user.dir") + "/src/main/resources/Adsızaa.png";
//        chooseFile.uploadFromClasspath(relativeFilePath);

    }

    @And("Click OK button")
    public void clickOKButton() {
        switchTo().alert().accept();
    }


    @And("Click Submit button")
    public void clickSubmitButton() {
        jsclick(submitButton);
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {

        homeButton.click();
//        verifyThatHomePageIsVisibleSuccessfully();
    }
}
