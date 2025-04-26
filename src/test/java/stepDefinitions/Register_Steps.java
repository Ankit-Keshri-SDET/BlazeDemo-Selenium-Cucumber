package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.AccountPage;
import pageObjects.RegisterPage;

public class Register_Steps {
    private WebDriver driver;
    private RegisterPage rp;

    @Given("I am on the Register Page")
    public void i_am_on_the_register_page() {
        driver = DriverFactory.getDriver();
        rp = new RegisterPage(driver);
        rp.load("https://blazedemo.com/register");
    }

    @When("I enter my {string}, {string}, {string}")
    public void i_enter_my(String name, String company, String email) {
        rp.enterName(name);
        rp.enterCompany(company);
        rp.enterEmailAddress(email);
    }

    @When("I enter my {string}, {string}")
    public void i_enter_my(String pass, String confirmPass) {
        rp.enterPassword(pass);
        rp.enterConfirmPassword(confirmPass);
    }

    @When("I click on the Register button")
    public void i_click_on_the_register_button() {
        rp.clickRegisterButton();
    }

    @Then("User should be navigated to the Account page")
    public void user_should_be_navigated_to_the_account_page() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://blazedemo.com/register";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String successMessage) {
        AccountPage ap = new AccountPage(driver);
        Assert.assertEquals(ap.getAccountMessage(), successMessage, "Message mismatched ......");
    }
}
