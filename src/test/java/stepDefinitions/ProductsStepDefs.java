package stepDefinitions;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ProductsPage;
import utils.ConfigReader;

import java.net.URL;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.url;

public class ProductsStepDefs extends ProductsPage {
    @And("Click on Products button")
    public void clickOnProductsButton() {
        productsButton.click();
        refresh();
        productsButton.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        allProducts.shouldHave(visible);
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        productViewList.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {

        productViewList.get(0).scrollTo().click();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        System.out.println("url() = " + url());
        Assert.assertTrue(url().contains("product_details"));
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        productName.shouldHave(visible);
        category.shouldHave(visible);
        price.shouldHave(visible);
        availability.shouldHave(visible);
        condition.shouldHave(visible);
        brand.shouldHave(visible);
    }
String searchingProduct;
    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        searchingProduct= ConfigReader.getProperty("searchingProduct");
        searchProducts.setValue(searchingProduct);
        searchProductButton.click(ClickOptions.usingJavaScript());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        searchedProductsNames.shouldHave(CollectionCondition.texts(searchingProduct));
    }
}
