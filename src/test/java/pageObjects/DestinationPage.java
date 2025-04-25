package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DestinationPage extends BasePage {

    @FindBy(xpath = "(//div//img)[1]")
    private WebElement imageLogo;

    public DestinationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(imageLogo));
        return imageLogo.isDisplayed();
    }
}
