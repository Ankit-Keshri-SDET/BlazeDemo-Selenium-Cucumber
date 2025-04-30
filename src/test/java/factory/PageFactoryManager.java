package factory;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageFactoryManager {
    private static HomePage homePage;
    private static ReservePage reservePage;
    private static PurchasePage purchasePage;
    private static ConfirmationPage confirmationPage;
    private static LoginPage loginPage;
    private static RegisterPage registerPage;
    private static AccountPage accountPage;
    private static DestinationPage destinationPage;
    private static ForgotPasswordPage forgotPasswordPage;

    public static HomePage getHomePage(WebDriver driver) {
        return homePage == null ? new HomePage(driver) : homePage;
    }

    public static ReservePage getReservePage(WebDriver driver) {
        return reservePage == null ? new ReservePage(driver) : reservePage;
    }

    public static PurchasePage getPurchasePage(WebDriver driver) {
        return purchasePage == null ? new PurchasePage(driver) : purchasePage;
    }

    public static ConfirmationPage getConfirmationPage(WebDriver driver) {
        return confirmationPage == null ? new ConfirmationPage(driver) : confirmationPage;
    }

    public static LoginPage getLoginPage(WebDriver driver) {
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }

    public static RegisterPage getRegisterPage(WebDriver driver) {
        return registerPage == null ? new RegisterPage(driver) : registerPage;
    }

    public static DestinationPage getDestinationPage(WebDriver driver) {
        return destinationPage == null ? new DestinationPage(driver) : destinationPage;
    }

    public static ForgotPasswordPage getForgotPasswordPage(WebDriver driver) {
        return forgotPasswordPage == null ? new ForgotPasswordPage(driver) : forgotPasswordPage;
    }

    public static AccountPage getAccountPage(WebDriver driver) {
        return accountPage == null ? new AccountPage(driver) : accountPage;
    }
}
