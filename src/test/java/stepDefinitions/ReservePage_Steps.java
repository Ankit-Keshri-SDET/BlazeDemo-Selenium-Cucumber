package stepDefinitions;

import context.TestContext;
import factory.PageFactoryManager;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObjects.ReservePage;

public class ReservePage_Steps {
    private final ReservePage rp;

    public ReservePage_Steps(TestContext context) {
        rp = PageFactoryManager.getReservePage(context.driver);
    }

    @Then("I should verify the {string}, {string} on the page")
    public void iShouldVerifyTheOnThePage(String fromCity, String toCity) {
        String routeDetail = rp.getFlightRouteDetails();
        Assert.assertTrue(routeDetail.contains(fromCity) && routeDetail.contains(toCity));
    }

    @When("I choose a flight for my booking")
    public void i_choose_a_flight_for_my_booking() {
        rp.chooseRandomFlightFromList();
    }

    @When("I choose the {string} Airline flight for my booking")
    public void iChooseTheAirlineFlightForMyBooking(String arg0) {
    }
}
