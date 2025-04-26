package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Page Expired')]")
    private WebElement accountPageMessage;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountMessage() {
        wait.until(ExpectedConditions.visibilityOf(accountPageMessage));
        return accountPageMessage.getText();
    }
}
