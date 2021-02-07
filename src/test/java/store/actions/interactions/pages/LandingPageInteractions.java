package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.BasicAction;
import store.pageobjects.pages.LandingPage;

public class LandingPageInteractions extends BasicAction {

    private LandingPage landingPage;

    public LandingPageInteractions(WebDriver driver) {
        super(driver);
        this.landingPage = PageFactory.initElements(driver, LandingPage.class);
    }

    public void navigateToLandingPage() {
        this.driver.get(this.landingPage.BASE_URL);
    }

    public void goToSignInPage() {

        this.landingPage.menu.singInButton.click();
    }

}
