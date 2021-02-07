package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.pageobjects.components.sitewide.FooterComp;
import store.pageobjects.components.sitewide.MenuBarComp;

public class LandingPage extends BasicPage{

    public MenuBarComp menu;
    public FooterComp footer;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.menu = PageFactory.initElements(driver, MenuBarComp.class);
        this.footer = PageFactory.initElements(driver, FooterComp.class);
    }

}
