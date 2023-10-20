package utils;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class ReusableMethods {
    public Faker faker;

    public static void jsclick(WebElement element) {

        executeJavaScript("arguments[0].scrollIntoView(true);", element);
        executeJavaScript("arguments[0].click()", element);
    }
}
