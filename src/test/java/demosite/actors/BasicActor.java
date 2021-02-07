package demosite.actors;

import demosite.actions.interactions.pages.LandingPageInteractions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasicActor {
    public WebDriver driver;

    protected LandingPageInteractions landingInteractions;

    public BasicActor(WebDriver driver) {
        this.driver = driver;
        this.landingInteractions = PageFactory.initElements(driver, LandingPageInteractions.class);
    }

    public void navigatesToLandingPage() {
        this.landingInteractions.navigateToLandingPage();
    }
}
