package stepDefinitions;

import context.TestContext;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordPage_Steps {
    private final WebDriver driver;
    private ForgotPasswordPage fp;

    public ForgotPasswordPage_Steps(TestContext context) {
        driver = context.driver;
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

    @Then("I should recover my password")
    public void i_should_recover_my_password() {
        System.out.println("Password Receovered ..");
    }
}
