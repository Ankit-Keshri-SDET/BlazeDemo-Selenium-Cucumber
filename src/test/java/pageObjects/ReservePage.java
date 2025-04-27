package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Random;

public class ReservePage extends BasePage {

    @FindBy(tagName = "h3")
    private WebElement flightDetailHeading;
    @FindBy(xpath = "//input[@type='submit']")
    private List<WebElement> chooseFlightButton;
    @FindBy(xpath = "//table//tr[1]//th[4]")
    private WebElement departsName;
    @FindBy(xpath = "//table//tr[1]//th[5]")
    private WebElement arrivesName;

    public ReservePage(WebDriver driver) {
        super(driver);
    }

    public void chooseRandomFlightFromList() {
        wait.until(ExpectedConditions.visibilityOfAllElements(chooseFlightButton));
        Random random = new Random();
        int randomIndex = random.nextInt(chooseFlightButton.size());
        chooseFlightButton.get(randomIndex).click();
    }

    public String getFlightRouteDetails() {
        String route[] = flightDetailHeading.getText().split("from");
        return route[1];
    }

}
