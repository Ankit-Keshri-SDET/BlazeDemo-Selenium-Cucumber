package stepDefinitions;

import contants.Endpoint;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.AccountPage;
import utils.ConfigLoader;

public class AccountPage_Steps {
    private WebDriver driver = DriverFactory.getDriver();

    @Then("User should be navigated to the Account page of {string}")
    public void user_should_be_navigated_to_the_account_page_of_login(String scenario) {
        if (scenario.equalsIgnoreCase("Login")) {
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = ConfigLoader.getInstance().getBaseUrl() + Endpoint.LOGIN.url;
            Assert.assertEquals(actualUrl, expectedUrl);
        } else if (scenario.equalsIgnoreCase("Register")) {
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = ConfigLoader.getInstance().getBaseUrl() + Endpoint.REGISTER.url;
            Assert.assertEquals(actualUrl, expectedUrl);
        } else {
            throw new IllegalStateException("Wrong scenario name listed ...");
        }
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String successMessage) {
        AccountPage ap = new AccountPage(driver);
        Assert.assertEquals(ap.getAccountMessage(), successMessage, "Message mismatched ......");
    }
}
