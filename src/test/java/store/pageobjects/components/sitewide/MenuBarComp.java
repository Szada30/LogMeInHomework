package store.pageobjects.components.sitewide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class MenuBarComp extends BasicObject {

    @FindBy(css = "nav")
    private WebElement menuBar;

    @FindBy(css = ".login")
    public WebElement singInButton;

    public MenuBarComp(WebDriver driver) {
        super(driver);
    }

    public WebElement menuItem(String menuItemText) {
        return menuBar.findElement(By.xpath(".//a[contains(text(), '" + menuItemText + "')]"));
    }

}
