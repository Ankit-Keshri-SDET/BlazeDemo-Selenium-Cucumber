package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Destination_Steps {
    private WebDriver driver;

    @Given("I am on the homepage of the BlazeDemo website")
    public void i_am_on_the_homepage_of_the_blaze_demo_website() {
        driver = DriverFactory.initializeDriver();
        driver.get("https://blazedemo.com/");
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        driver.findElement(By.xpath("//a[contains(@href,'vacation')]")).click();
    }

    @Then("I should be redirected to the {string}")
    public void i_should_be_redirected_to_the(String url) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(url, currentURL);
    }

    @Then("I should see the image of the place")
    public void i_should_see_the_name_and_image_of_the_place() {
        WebElement image = driver.findElement(By.tagName("img"));
        Assert.assertTrue(image.isDisplayed());
        driver.quit();
    }

}
