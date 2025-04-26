package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement confirmationTxt;
    @FindBy(xpath = "//table//tbody//tr[1]//td[2]")
    private WebElement purchaseID;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationText() {
        return wait.until(ExpectedConditions.visibilityOf(confirmationTxt)).getText();
    }

    public String getPurchaseID() {
        return "Your Purchase ID is: " + wait.until(ExpectedConditions.visibilityOf(purchaseID)).getText();
    }
}
