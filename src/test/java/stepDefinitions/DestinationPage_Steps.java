package stepDefinitions;

import context.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.DestinationPage;

public class DestinationPage_Steps {
    private final WebDriver driver;

    public DestinationPage_Steps(TestContext context) {
        driver = context.driver;
    }

    @Then("I should be redirected to the {string}")
    public void i_should_be_redirected_to_the(String url) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(url, currentURL);
    }

    @Then("I should see the image of the place")
    public void i_should_see_the_name_and_image_of_the_place() {
        DestinationPage dp = new DestinationPage(driver);
        Assert.assertTrue(dp.isDisplayed());
    }
}
