package stepDefinitions;

import domainObjects.PurchaseDetails;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.PurchasePage;

public class PurchasePage_Steps {
    private WebDriver driver;
    private PurchasePage pp;
    private PurchaseDetails purchaseDetails;

    @Then("I should verify the {string} on the page")
    public void iShouldVerifyTheOnThePage(String purchasePageHeadingText) {
        driver = DriverFactory.getDriver();
        pp = new PurchasePage(driver);
        Assert.assertTrue(pp.getPageHeading().contains(purchasePageHeadingText));
    }

    @When("I provide personal details")
    public void i_provide_personal_details(PurchaseDetails purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
        pp.purchaseFlightAfterAddingDetails(purchaseDetails);
    }

    @When("I click on Purchase Flight button")
    public void i_click_on_purchase_flight_button() {
        pp.clickPurchaseFlight();
    }

    @And("I have my personal details as")
    public void iHaveMyPersonalDetailsAs(PurchaseDetails personDetails) {
        pp = new PurchasePage(driver);
        this.purchaseDetails = personDetails;
    }

    @And("I provide card details")
    public void iProvideCardDetails(PurchaseDetails cardDetails) {
        this.purchaseDetails = cardDetails;
        pp.enterCardDetails(cardDetails);
    }

    @And("I enter my personal details on the page")
    public void iEnterMyPersonalDetailsOnThePage() {
        pp.enterMyPersonalDetails(purchaseDetails);
    }
}
