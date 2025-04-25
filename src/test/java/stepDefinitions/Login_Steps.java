package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

public class Login_Steps {
    private WebDriver driver;
    private LoginPage lp;

    @Given("User am on the Login page")
    public void user_am_on_the_login_page() {
        driver = DriverFactory.getDriver();
        lp = new LoginPage(driver);
        lp.load("https://blazedemo.com/login");
    }

    @When("User enter email and password as {string} and {string}")
    public void user_enter_my_and(String username, String password) {
        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @When("User click on Remember Me checkbox")
    public void user_click_on_remember_me_checkbox() {
        lp.clickOnCheckbox();
    }

    @When("User click on Login button")
    public void user_click_on_login_button() {
        lp.clickOnLoginBtn();
    }

    @Then("User should be navigated to the Account page")
    public void user_should_be_navigated_to_the_account_page() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://blazedemo.com/login";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String successMessage) {
        String txtMessage = driver.findElement(By.xpath("//div[contains(text(),'Page Expired')]")).getText();
        Assert.assertEquals(txtMessage, successMessage, "Message mismatched ......");
    }
}
