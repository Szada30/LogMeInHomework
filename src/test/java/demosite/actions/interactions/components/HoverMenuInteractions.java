package demosite.actions.interactions.components;

import demosite.actions.BasicAction;
import demosite.pageobjects.components.HoverMenuComp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HoverMenuInteractions extends BasicAction {

    private HoverMenuComp hoverMenuComp;

    public HoverMenuInteractions(WebDriver driver) {
        super(driver);
        this.hoverMenuComp = PageFactory.initElements(driver, HoverMenuComp.class);
    }

    public void openMainMenuItem(String itemName) {
        new Actions(this.driver).moveToElement(this.hoverMenuComp.mainMenuItem(itemName)).perform();
    }

    public void selectSubMenuItem(String itemName) {
        this.hoverMenuComp.mainMenuItem(itemName).click();
    }
}
