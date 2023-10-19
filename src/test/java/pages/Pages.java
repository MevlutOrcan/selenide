package pages;

public class Pages {
    HomeSignUpLoginPage homeSignUpLoginPage;

    public HomeSignUpLoginPage homeSignUpLoginPage() {
        if (homeSignUpLoginPage == null) {
            homeSignUpLoginPage = new HomeSignUpLoginPage();
        }
        return homeSignUpLoginPage;

    }
}
