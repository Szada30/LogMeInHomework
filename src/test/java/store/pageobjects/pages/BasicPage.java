package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import store.pageobjects.BasicObject;

public abstract class BasicPage extends BasicObject {

    public static final String BASE_URL = "http://automationpractice.com/index.php";
    public String url;

    public BasicPage(WebDriver driver) {
        super(driver);
    }
}
