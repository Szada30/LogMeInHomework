package demosite.actors;

import demosite.actions.interactions.components.HoverMenuInteractions;
import demosite.actions.interactions.pages.LiveSeleniumPageInteractions;
import demosite.actions.questions.pages.LiveSeleniumQuestions;
import demosite.actions.questions.pages.SeleniumTutorialQuestions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Anonymus extends BasicActor{

    private LiveSeleniumPageInteractions liveSeleniumPageInteractions;
    private HoverMenuInteractions hoverMenuInteractions;

    private LiveSeleniumQuestions liveSeleniumQuestions;
    private SeleniumTutorialQuestions seleniumTutorialQuestions;

    public Anonymus(WebDriver driver) {
        super(driver);

        this.liveSeleniumPageInteractions = new LiveSeleniumPageInteractions(driver);
        this.hoverMenuInteractions = new HoverMenuInteractions(driver);

        this.liveSeleniumQuestions = new LiveSeleniumQuestions(driver);
        this.seleniumTutorialQuestions = new SeleniumTutorialQuestions(driver);
    }

    public void clicksOnSeleniumLiveLink() {
        this.landingInteractions.clickOnSeleniumLiveLink();
    }

    public void checksLiveSeleniumOnNewTab() {
        this.liveSeleniumQuestions.isOnNewTab();
    }

    public void checksLiveSeleniumPageContent() {
        this.landingInteractions.switchToSeleniumLivePage();
        this.liveSeleniumQuestions.isTitlePresent();
    }

    public void closesLiveSeleniumPage() {
        this.liveSeleniumPageInteractions.closeLiveSeleniumPage();
    }

    public void selectsMenuItem(String fromMainMenu, String subMenuItem) {
        this.hoverMenuInteractions.openMainMenuItem(fromMainMenu);
        this.hoverMenuInteractions.selectSubMenuItem(subMenuItem);
    }

    public void checksBigRedButton() {
        this.seleniumTutorialQuestions.checkJoinNowButton();
    }

}
