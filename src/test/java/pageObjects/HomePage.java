package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath="//a[@href='index.php']")
    private WebElement logoLink;
    @FindBy(xpath="//a[@href='home']")
    private WebElement loginPageLink;
    @FindBy(tagName="h1")
    private WebElement headerText;
    @FindBy(xpath="//p[contains(text(),'Blaze')]")
    private WebElement firstText;
    @FindBy(css="a[href*='vacation']")
    private WebElement destinationLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }


}
