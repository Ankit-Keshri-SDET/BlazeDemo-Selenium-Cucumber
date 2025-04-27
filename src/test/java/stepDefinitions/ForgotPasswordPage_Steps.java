package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordPage_Steps {
    private WebDriver driver;
    private ForgotPasswordPage fp;

    @When("I provide my {string}")
    public void i_provide_my(String emailAddress) {
        driver = DriverFactory.getDriver();
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
