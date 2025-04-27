package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.ReservePage;

public class ReservePage_Steps {
    private WebDriver driver;
    private ReservePage rp;

    @Then("I should verify the {string}, {string} on the page")
    public void iShouldVerifyTheOnThePage(String fromCity, String toCity) {
        driver = DriverFactory.getDriver();
        rp = new ReservePage(driver);
        String routeDetail = rp.getFlightRouteDetails();
        Assert.assertTrue(routeDetail.contains(fromCity) && routeDetail.contains(toCity));
    }

    @When("I choose a flight for my booking")
    public void i_choose_a_flight_for_my_booking() {
        rp = new ReservePage(driver);
        rp.chooseRandomFlightFromList();
    }

    @When("I choose the {string} Airline flight for my booking")
    public void iChooseTheAirlineFlightForMyBooking(String arg0) {
    }
}
