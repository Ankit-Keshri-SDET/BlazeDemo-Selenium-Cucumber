package stepDefinitions;

import contants.Endpoint;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class LoginPage_Steps {
    private final WebDriver driver;
    private LoginPage lp;

    public LoginPage_Steps(TestContext context){
        driver = context.driver;
    }

    @Given("User am on the Login page")
    public void user_am_on_the_login_page() {
        lp = new LoginPage(driver);
        lp.load(Endpoint.LOGIN.url);
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
