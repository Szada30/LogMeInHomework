package demosite.actions.interactions.pages;

import demosite.actions.BasicAction;
import demosite.pageobjects.pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class LandingPageInteractions extends BasicAction {

    private LandingPage landingPage;

    public LandingPageInteractions(WebDriver driver) {
        super(driver);
        this.landingPage = PageFactory.initElements(driver, LandingPage.class);
    }

    public void navigateToLandingPage() {
        this.driver.get(this.landingPage.BASE_URL);
    }

    public void clickOnSeleniumLiveLink() {
        this.driver.switchTo().frame(this.landingPage.jMeterIframeElement);
        this.landingPage.seleniumLiveLink.click();
    }

    public void switchToSeleniumLivePage() {
        this.driver.switchTo().window(new ArrayList<String>(this.driver.getWindowHandles()).get(1));
    }

}
