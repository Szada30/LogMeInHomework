package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.BasicAction;
import store.actions.interactions.pages.support.ScrollByPixel;
import store.actions.questions.support.VisibleInViewport;
import store.pageobjects.components.sitewide.FooterComp;

public class SiteWideInteractions extends BasicAction {

    private FooterComp footerComp;

    public SiteWideInteractions(WebDriver driver)
    {
        super(driver);
        this.footerComp = PageFactory.initElements(driver, FooterComp.class);
    }

    public void scrollToFooterBy100Pixel() {
        ScrollByPixel scroller = new ScrollByPixel(this.driver);
        VisibleInViewport visibilityChecker = new VisibleInViewport(this.driver);

        while(!visibilityChecker.isElementInViewport(this.footerComp.footerContainer)) {
            scroller.scrollByPixelHorizontally(100);
        }
    }

}
