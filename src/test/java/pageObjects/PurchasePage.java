package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage extends BasePage {

    @FindBy(name = "inputName")
    private WebElement nameField;
    @FindBy(name = "address")
    private WebElement addressField;
    @FindBy(name = "city")
    private WebElement cityField;
    @FindBy(name = "state")
    private WebElement stateField;
    @FindBy(name = "zipCode")
    private WebElement zipCodeField;
    @FindBy(name = "cardType")
    private WebElement cardTypeDropdown;
    @FindBy(name = "creditCardNumber")
    private WebElement creditCardNumberField;
    @FindBy(name = "creditCardMonth")
    private WebElement creditCardMonthField;
    @FindBy(name = "creditCardYear")
    private WebElement creditCardYearField;
    @FindBy(name = "nameOnCard")
    private WebElement nameOnCardField;
    @FindBy(name = "rememberMe")
    private WebElement rememberMeCheckbox;
    @FindBy(xpath = "//input[@value='Purchase Flight']")
    private WebElement purchaseFlightButton;
    @FindBy(tagName = "h2")
    private WebElement pageHeading;

    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(name);
    }

    public void enterAddress(String address) {
        wait.until(ExpectedConditions.visibilityOf(addressField)).sendKeys(address);
    }

    public void enterCity(String city) {
        wait.until(ExpectedConditions.visibilityOf(cityField)).sendKeys(city);
    }

    public void enterState(String state) {
        wait.until(ExpectedConditions.visibilityOf(stateField)).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        wait.until(ExpectedConditions.visibilityOf(zipCodeField)).sendKeys(zipCode);
    }

    public void selectCardType(String cardType) {
        Select sel = new Select(cardTypeDropdown);
        sel.selectByVisibleText(cardType);
    }

    public void enterCreditCardNumber(String cardNumber) {
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberField)).sendKeys(cardNumber);
    }

    public void enterCreditCardMonth(String month) {
        wait.until(ExpectedConditions.visibilityOf(creditCardMonthField)).clear();
        wait.until(ExpectedConditions.visibilityOf(creditCardMonthField)).sendKeys(month);
    }

    public void enterCreditCardYear(String year) {
        wait.until(ExpectedConditions.visibilityOf(creditCardYearField)).clear();
        wait.until(ExpectedConditions.visibilityOf(creditCardYearField)).sendKeys(year);
    }

    public void enterNameOnCard(String nameOnCard) {
        wait.until(ExpectedConditions.visibilityOf(nameOnCardField)).sendKeys(nameOnCard);
    }

    public void checkRememberMe() {
        if (!rememberMeCheckbox.isSelected()) {
            rememberMeCheckbox.click();
        }
    }

    public void clickPurchaseFlight() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseFlightButton)).click();
    }

    public String getPageHeading() {
        return wait.until(ExpectedConditions.visibilityOf(pageHeading)).getText();
    }
}
