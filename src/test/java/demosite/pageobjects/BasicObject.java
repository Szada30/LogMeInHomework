package demosite.pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasicObject {
    public WebDriver driver;

    public BasicObject(WebDriver driver) {
        this.driver = driver;
    }

    //public abstract void waitForPageLoad();
}
