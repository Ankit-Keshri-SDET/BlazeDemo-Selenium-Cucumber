package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {

    @FindBy(id = "name")
    private WebElement nameField;
    @FindBy(id = "company")
    private WebElement companyField;
    @FindBy(id = "email")
    private WebElement emailAddressField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "password-confirm")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(name);
    }

    public void enterCompany(String company) {
        wait.until(ExpectedConditions.visibilityOf(companyField)).sendKeys(company);
    }

    public void enterEmailAddress(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailAddressField)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordField)).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
    }
}
