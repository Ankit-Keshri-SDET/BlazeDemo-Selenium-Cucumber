package stepDefinitions;

import contants.Endpoint;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.RegisterPage;

public class RegisterPage_Steps {
    private WebDriver driver;
    private RegisterPage rp;

    @Given("I am on the Register Page")
    public void i_am_on_the_register_page() {
        driver = DriverFactory.getDriver();
        rp = new RegisterPage(driver);
        rp.load(Endpoint.REGISTER.url);
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
}
