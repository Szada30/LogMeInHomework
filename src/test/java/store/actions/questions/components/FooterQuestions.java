package store.actions.questions.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import store.actions.BasicAction;
import store.actions.questions.support.VisibleInViewport;
import store.pageobjects.components.sitewide.FooterComp;

public class FooterQuestions extends BasicAction {

    private FooterComp footerComp;

    public FooterQuestions(WebDriver driver) {
        super(driver);
        this.footerComp = PageFactory.initElements(driver, FooterComp.class);
    }

    public void isFooterVisible() {
        Assert.assertTrue(new VisibleInViewport(this.driver).isElementInViewport(this.footerComp.footerContainer));
    }
}
