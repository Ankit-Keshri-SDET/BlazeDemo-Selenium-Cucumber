package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.AccountPage;
import utils.ConfigLoader;

import java.sql.Driver;

public class AccountPage_Steps {
    private WebDriver driver = DriverFactory.getDriver();

    @Then("User should be navigated to the Account page")
    public void user_should_be_navigated_to_the_account_page() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ConfigLoader.getInstance().getBaseUrl() + "/login";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String successMessage) {
        AccountPage ap = new AccountPage(driver);
        Assert.assertEquals(ap.getAccountMessage(), successMessage, "Message mismatched ......");
    }
}
