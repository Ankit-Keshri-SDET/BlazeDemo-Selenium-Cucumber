package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordPage extends BasePage {

    @FindBy(xpath = "//*[@class='panel-heading']")
    private WebElement resetPasswordModalLogo;
    @FindBy(id = "email")
    private WebElement emailAddressField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSubmitBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
    }

    public void enterEmailAddressField(String emailID) {
        wait.until(ExpectedConditions.visibilityOf(emailAddressField)).sendKeys(emailID);
    }
}
