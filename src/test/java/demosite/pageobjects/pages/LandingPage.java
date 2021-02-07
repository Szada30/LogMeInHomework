package demosite.pageobjects.pages;

import demosite.pageobjects.components.HoverMenuComp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasicPage {

    public HoverMenuComp hoverMenu;

    @FindBy(id = "a077aa5e")
    public WebElement jMeterIframeElement;

    @FindBy(css = "a > img[src='Jmeter720.png']")
    public WebElement seleniumLiveLink;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.hoverMenu = PageFactory.initElements(driver, HoverMenuComp.class);
    }
}
