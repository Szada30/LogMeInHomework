package demosite.actions.questions.pages;

import demosite.actions.BasicAction;
import demosite.pageobjects.pages.LiveSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LiveSeleniumQuestions extends BasicAction {

    private LiveSeleniumPage liveSeleniumPage;

    public LiveSeleniumQuestions(WebDriver driver) {
        super(driver);
        this.liveSeleniumPage = PageFactory.initElements(driver, LiveSeleniumPage.class);
    }

    public void isOnNewTab() {
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public void isTitlePresent() {
        Assert.assertTrue(this.liveSeleniumPage.pageTitle.isDisplayed());
    }

}
