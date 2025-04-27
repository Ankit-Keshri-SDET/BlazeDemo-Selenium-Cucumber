package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='index.php']")
    private WebElement logoLink;

    @FindBy(tagName = "h1")
    private WebElement headerText;
    @FindBy(xpath = "//p[contains(text(),'Blaze')]")
    private WebElement firstText;
    @FindBy(css = "a[href*='vacation']")
    private WebElement destinationLink;
    @FindBy(xpath = "//h2[contains(text(),'departure')]")
    private WebElement departureHeading;
    @FindBy(xpath = "//h2[contains(text(),'destination')]")
    private WebElement destinationHeading;
    @FindBy(name = "fromPort")
    private WebElement fromPort;
    @FindBy(name = "toPort")
    private WebElement toPort;
    @FindBy(css = "input[type='submit']")
    private WebElement findFlightBtn;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDestinationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(destinationLink)).click();
    }

    public void clickOnFindFlightsButton() {
        findFlightBtn.click();
    }

    public void selectFromPort(String src) {
        wait.until(ExpectedConditions.elementToBeClickable(fromPort));
        Select sel = new Select(fromPort);
        sel.selectByVisibleText(src);
    }

    public void selectToPort(String dest) {
        wait.until(ExpectedConditions.elementToBeClickable(toPort));
        Select sel = new Select(toPort);
        sel.selectByVisibleText(dest);
    }

}
