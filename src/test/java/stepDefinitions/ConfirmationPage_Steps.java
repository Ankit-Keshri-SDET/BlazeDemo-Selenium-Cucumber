package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.ConfirmationPage;

public class ConfirmationPage_Steps {
    private WebDriver driver;
    private ConfirmationPage cp;

    @Then("I should see the {string}")
    public void i_should_see_the(String thankyouText) {
        driver = DriverFactory.getDriver();
        cp = new ConfirmationPage(driver);
        Assert.assertEquals(cp.getConfirmationText(), thankyouText);
    }

    @Then("My flight details should be displayed")
    public void my_flight_details_should_be_displayed() {
        String pID = cp.getPurchaseID();
        System.out.println(pID);
    }
}
