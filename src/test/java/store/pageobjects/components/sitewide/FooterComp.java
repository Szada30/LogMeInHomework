package store.pageobjects.components.sitewide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class FooterComp extends BasicObject {

    @FindBy(id = "footer")
    public WebElement footerContainer;

    public FooterComp(WebDriver driver) {
        super(driver);
    }
}
