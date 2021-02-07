package demosite.pageobjects.pages;

import demosite.pageobjects.BasicObject;
import org.openqa.selenium.WebDriver;

public abstract class BasicPage extends BasicObject {

    public static final String BASE_URL = "http://demo.guru99.com/test/guru99home/";
    public String url;

    public BasicPage(WebDriver driver) {
        super(driver);
    }
}
