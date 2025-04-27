package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class LoginPage_Steps {
    private WebDriver driver;
    private LoginPage lp;

    @Given("User am on the Login page")
    public void user_am_on_the_login_page() {
        driver = DriverFactory.getDriver();
        lp = new LoginPage(driver);
        lp.load("/login");
    }

    @When("User enter email and password as {string} and {string}")
    public void user_enter_my_and(String username, String password) {
        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @When("User click on Remember Me checkbox")
    public void user_click_on_remember_me_checkbox() {
        lp.clickOnCheckbox();
    }

    @When("User click on Login button")
    public void user_click_on_login_button() {
        lp.clickOnLoginBtn();
    }

    @When("I click on Forgot Your password link")
    public void i_click_on_forgot_your_password_link() {
        lp.clickOnForgotPasswordLink();
    }
}
