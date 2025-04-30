package stepDefinitions;

import context.TestContext;
import domainObjects.CityDetails;
import factory.PageFactoryManager;
import io.cucumber.java.en.*;
import pageObjects.HomePage;

public class HomePage_Steps {
    private final HomePage hp;

    public HomePage_Steps(TestContext context) {
        hp = PageFactoryManager.getHomePage(context.driver);
    }

    @Given("I am on the homepage of the BlazeDemo website")
    public void i_am_on_the_homepage_of_the_blaze_demo_website() {
        hp.load();
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        hp.clickOnDestinationLink();
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

    @When("I select {cityName}, {cityName} as source and destination city")
    public void iSelectAsSourceAndDestinationCity(CityDetails src, CityDetails dest) {
        hp.selectFromPort(src.getCity());
        hp.selectToPort(dest.getCity());
    }
}
