package demosite.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumTutorialPage extends BasicPage{

    @FindBy(css = "[title='Join Now']")
    public WebElement joinNowButton;

    public SeleniumTutorialPage(WebDriver driver) {
        super(driver);
    }
}
