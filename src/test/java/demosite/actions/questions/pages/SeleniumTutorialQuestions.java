package demosite.actions.questions.pages;

import demosite.actions.BasicAction;
import demosite.pageobjects.pages.SeleniumTutorialPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SeleniumTutorialQuestions extends BasicAction {

    private SeleniumTutorialPage seleniumTutorialPage;

    public SeleniumTutorialQuestions(WebDriver driver) {
        super(driver);
        this.seleniumTutorialPage = PageFactory.initElements(driver, SeleniumTutorialPage.class);
    }

    public void checkJoinNowButton() {
        Assert.assertTrue(this.seleniumTutorialPage.joinNowButton.isDisplayed());
    }
}
