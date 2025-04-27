package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(className = "navbar-brand")
    private WebElement homePageLogo;
    @FindBy(id = "email")
    private WebElement emailAddress;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(css = "[name='remember']")
    private WebElement rememberCheckbox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;
    @FindBy(xpath = "//a[@class='btn btn-link']")
    private WebElement forgotPassLink;
    @FindBy(css = "[href*='register']")
    private WebElement registerLink;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String userName) {
        wait.until(ExpectedConditions.visibilityOf(emailAddress));
        emailAddress.sendKeys(userName);
    }

    public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);
    }

    public void clickOnCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(rememberCheckbox)).click();
    }

    public void clickOnLoginBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void performLogin(String userName, String pass) {
        enterUsername(userName);
        enterPassword(pass);
        clickOnCheckbox();
        clickOnLoginBtn();
    }

    public void clickOnForgotPasswordLink() {
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLink)).click();
    }

    public void clickOnRegisterLink() {
        wait.until(ExpectedConditions.elementToBeClickable(registerLink)).click();
    }

    public void goToHomePage() {
        wait.until(ExpectedConditions.elementToBeClickable(homePageLogo)).click();
    }
}
