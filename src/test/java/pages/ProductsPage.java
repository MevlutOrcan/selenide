package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {
    public SelenideElement productsButton = $("[href=\"/products\"]");
    public SelenideElement allProducts = $(By.xpath("//*[.='All Products']"));
    public List<SelenideElement> productViewList = $$("[class=\"nav nav-pills nav-justified\"]");
    public SelenideElement availability = $(By.xpath("//p[2]/b"));
    public SelenideElement condition = $(By.xpath("//p[3]/b"));
    public SelenideElement brand = $(By.xpath("//p[4]/b"));
    public SelenideElement productName = $(By.xpath("//div[2]/div[2]/div/h2"));
    public SelenideElement category = $(By.xpath("//div[2]/div/p[1]"));



}
