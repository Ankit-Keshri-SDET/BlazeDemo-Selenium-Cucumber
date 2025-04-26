package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.AccountPage;
import pageObjects.ForgotPasswordPage;
import pageObjects.LoginPage;

public class ForgotPassword_Steps {

    private WebDriver driver;
    private LoginPage lp;
    private ForgotPasswordPage fp;
    private AccountPage ap;

    @Given("User am on the Login page")
    public void user_am_on_the_login_page() {
        driver = DriverFactory.getDriver();
        lp = new LoginPage(driver);
        lp.load("https://blazedemo.com/login");
    }

    @When("I click on Forgot Your password link")
    public void i_click_on_forgot_your_password_link() {
        lp.clickOnForgotPasswordLink();
    }

    @When("I provide my {string}")
    public void i_provide_my(String emailAddress) {
        fp = new ForgotPasswordPage(driver);
        fp.enterEmailAddressField(emailAddress);
    }

    @When("I click on Send button")
    public void i_click_on_send_button() {
        fp.clickOnSubmitBtn();
    }

    @Then("I should see a {string} on the page")
    public void i_should_see_a_on_the_page(String successMessage) {
        AccountPage ap = new AccountPage(driver);
        Assert.assertEquals(ap.getAccountMessage(), successMessage, "Message mismatched ......");
    }

    @Then("I should recover my password")
    public void i_should_recover_my_password() {
        System.out.println("Password Receovered ..");
    }
}
