package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasicPage{

    @FindBy(css = "[title='Addresses']")
    public WebElement myAddressesLink;

    @FindBy(css = "[title='Information']")
    public WebElement myPersonalInfoLink;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
}
