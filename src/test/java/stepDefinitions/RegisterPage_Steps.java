package stepDefinitions;

import contants.Endpoint;
import context.TestContext;
import factory.PageFactoryManager;
import io.cucumber.java.en.*;
import pageObjects.RegisterPage;

public class RegisterPage_Steps {
    private final RegisterPage rp;

    public RegisterPage_Steps(TestContext context) {
        rp = PageFactoryManager.getRegisterPage(context.driver);
    }

    @Given("I am on the Register Page")
    public void i_am_on_the_register_page() {
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
