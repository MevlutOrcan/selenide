package pages;

import utils.ReusableMethods;

public class Pages extends ReusableMethods {
    HomeSignUpLoginPage homeSignUpLoginPage;
    ProductsPage productsPage;

    public HomeSignUpLoginPage homeSignUpLoginPage() {
        if (homeSignUpLoginPage == null) {
            homeSignUpLoginPage = new HomeSignUpLoginPage();
        }
        return homeSignUpLoginPage;

    }

     public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;

    }


}
