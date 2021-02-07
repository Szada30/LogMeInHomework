package demosite.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveSeleniumPage extends BasicPage {

    @FindBy(xpath = ".//div[@class='page-header']/h1[contains(text(), 'Selenium Live Project: FREE Real Time Project for Practice')]")
    public WebElement pageTitle;

    public LiveSeleniumPage(WebDriver driver) {
        super(driver);
    }
}
