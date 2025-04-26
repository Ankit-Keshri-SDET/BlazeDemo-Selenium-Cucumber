package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.ConfirmationPage;
import pageObjects.HomePage;
import pageObjects.PurchasePage;
import pageObjects.ReservePage;

import java.util.List;
import java.util.Map;

public class Flight_Booking_E2E_Steps {
    private WebDriver driver;
    private HomePage hp;
    private ReservePage rp;
    private PurchasePage pp;
    private ConfirmationPage cp;

    @Given("I am on the homepage of the BlazeDemo website")
    public void i_am_on_the_homepage_of_the_blaze_demo_website() {
        driver = DriverFactory.getDriver();
        hp = new HomePage(driver);
        hp.load("https://blazedemo.com/");
    }

    @When("I select the {string}, {string} from dropdown")
    public void i_select_the_from_dropdown(String departureCity, String destinationCity) {
        hp.selectFromPort(departureCity);
        hp.selectToPort(destinationCity);
    }

    @When("I click on the Find Flights button")
    public void i_click_on_the_find_flights_button() {
        hp.clickOnFindFlightsButton();
    }

    @Then("I should verify the {string}, {string} on the page")
    public void iShouldVerifyTheOnThePage(String fromCity, String toCity) {
        rp = new ReservePage(driver);
        String routeDetail = rp.getFlightRouteDetails();
        Assert.assertTrue(routeDetail.contains(fromCity) && routeDetail.contains(toCity));
    }

    @When("I choose a flight for my booking")
    public void i_choose_a_flight_for_my_booking() {
        rp = new ReservePage(driver);
        rp.chooseRandomFlightFromList();
    }

    @Then("I should verify the {string} on the page")
    public void iShouldVerifyTheOnThePage(String purchasePageHeadingText) {
        pp = new PurchasePage(driver);
        Assert.assertTrue(pp.getPageHeading().contains(purchasePageHeadingText));
    }

    @When("I provide personal details")
    public void i_provide_personal_details(List<Map<String, String>> billingDetails) {
        pp.enterName(billingDetails.get(0).get("name"));
        pp.enterAddress(billingDetails.get(0).get("address"));
        pp.enterCity(billingDetails.get(0).get("city"));
        pp.enterState(billingDetails.get(0).get("state"));
        pp.enterZipCode(billingDetails.get(0).get("zipCode"));
        pp.selectCardType(billingDetails.get(0).get("cardType"));
        pp.enterCreditCardNumber(billingDetails.get(0).get("creditCardNumber"));
        pp.enterCreditCardMonth(billingDetails.get(0).get("month"));
        pp.enterCreditCardYear(billingDetails.get(0).get("year"));
        pp.enterNameOnCard(billingDetails.get(0).get("nameOnCard"));
    }

    @When("I click on Purchase Flight button")
    public void i_click_on_purchase_flight_button() {
        pp.clickPurchaseFlight();
    }

    @Then("I should see the {string}")
    public void i_should_see_the(String thankyouText) {
        cp = new ConfirmationPage(driver);
        Assert.assertEquals(cp.getConfirmationText(), thankyouText);
    }

    @Then("My flight details should be displayed")
    public void my_flight_details_should_be_displayed() {
        String pID = cp.getPurchaseID();
        System.out.println(pID);
    }
}
