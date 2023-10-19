package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomeSignUpLoginPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegisterStepDefs extends HomeSignUpLoginPage {
    @Given("Navigate to url {string}")
    public void navigateToUrl(String arg0) {
        open(arg0);
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
        navigateToUrl("https://automationexercise.com/");
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        loggedIn.shouldBe(visible);
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        deleteAccount.shouldBe(visible);
    }

    @And("Verify that {string} is visible and click Continue button")
    public void verifyThatIsVisibleAndClickContinueButton(String arg0) {
        Assert.assertTrue(WebDriverRunner.source().contains(arg0));
        continueButton.click();
    }
}
