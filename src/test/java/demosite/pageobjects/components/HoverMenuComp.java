package demosite.pageobjects.components;

import demosite.pageobjects.BasicObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoverMenuComp extends BasicObject {

    @FindBy(className = "menu-block")
    public WebElement hoverMenu;

    public HoverMenuComp(WebDriver driver) {
        super(driver);
    }

    public WebElement mainMenuItem(String menuItemText) {
        return hoverMenu.findElement(By.xpath(".//a[contains(text(), '" + menuItemText + "')]"));
    }
}
