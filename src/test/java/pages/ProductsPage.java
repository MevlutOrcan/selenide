package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.ReusableMethods;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage extends ReusableMethods {
    public SelenideElement productsButton = $("[href=\"/products\"]");
    public SelenideElement allProducts = $(By.xpath("//*[.='All Products']"));
    public ElementsCollection productViewList = $$("[class=\"nav nav-pills nav-justified\"]");
    public SelenideElement availability = $(By.xpath("//p[2]/b"));
    public SelenideElement condition = $(By.xpath("//p[3]/b"));
    public SelenideElement price = $(By.xpath("//span/span"));
    public SelenideElement brand = $(By.xpath("//p[4]/b"));
    public SelenideElement productName = $(By.xpath("//div[2]/div[2]/div/h2"));
    public SelenideElement category = $(By.xpath("//div[2]/div/p[1]"));

    public SelenideElement searchProducts = $("[id=\"search_product\"]");
    public SelenideElement searchProductButton = $("[id=\"submit_search\"]");
    public ElementsCollection searchedProductsNames = $$(By.xpath("//div/div/div/div[1]/div[1]/p"));



}
