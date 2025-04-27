package stepDefinitions;

import domainObjects.CityDetails;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utils.ConfigLoader;

public class HomePage_Steps {
    private WebDriver driver;
    private HomePage hp;

    @Given("I am on the homepage of the BlazeDemo website")
    public void i_am_on_the_homepage_of_the_blaze_demo_website() {
        driver = DriverFactory.getDriver();
        hp = new HomePage(driver);
        hp.load(ConfigLoader.getInstance().getBaseUrl());
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
        System.out.println("Source City: " + src.getCity());
        System.out.println("Destination City: " + dest.getCity());
    }
}
