package stepDefinitions;

import context.TestContext;
import factory.PageFactoryManager;
import io.cucumber.java.en.*;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordPage_Steps {
    private final ForgotPasswordPage fp;

    public ForgotPasswordPage_Steps(TestContext context) {
        fp = PageFactoryManager.getForgotPasswordPage(context.driver);
    }

    @When("I provide my {string}")
    public void i_provide_my(String emailAddress) {
        fp.enterEmailAddressField(emailAddress);
    }

    @When("I click on Send button")
    public void i_click_on_send_button() {
        fp.clickOnSubmitBtn();
    }
}
