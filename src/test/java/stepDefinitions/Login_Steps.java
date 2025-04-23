package stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Login_Steps {

    private WebDriver driver;

    @Given("User am on the Login page")
    public void user_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://blazedemo.com/login");
    }

    @When("User enter my {string} and {string}")
    public void user_enter_my_and(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(username);
    }

    @When("User click on Remember Me checkbox")
    public void user_click_on_remember_me_checkbox() {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    @When("User click on Login button")
    public void user_click_on_login_button() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    @Then("User should be navigated to the Home page")
    public void user_should_be_navigated_to_the_home_page() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://blazedemo.com/login";
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String successMessage) {
        String txtMessage = driver.findElement(By.xpath("//div[contains(text(),'Page Expired')]")).getText();
        Assert.assertEquals(txtMessage, successMessage, "Message mismatched .....");
    }
}
