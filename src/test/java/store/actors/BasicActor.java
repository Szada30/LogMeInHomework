package store.actors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.interactions.pages.LandingPageInteractions;
import store.pageobjects.pages.LandingPage;

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
