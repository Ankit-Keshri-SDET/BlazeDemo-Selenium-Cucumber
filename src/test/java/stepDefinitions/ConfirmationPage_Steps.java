package stepDefinitions;

import context.TestContext;
import factory.PageFactoryManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.ConfirmationPage;

public class ConfirmationPage_Steps {
    private final ConfirmationPage cp;

    public ConfirmationPage_Steps(TestContext context) {
        cp = PageFactoryManager.getConfirmationPage(context.driver);
    }

    @Then("I should see the {string}")
    public void i_should_see_the(String thankyouText) {
        Assert.assertEquals(cp.getConfirmationText(), thankyouText);
    }

    @Then("My flight details should be displayed")
    public void my_flight_details_should_be_displayed() {
        String pID = cp.getPurchaseID();
        System.out.println(pID);
    }
}
