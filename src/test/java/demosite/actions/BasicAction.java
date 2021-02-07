package demosite.actions;

import org.openqa.selenium.WebDriver;

public abstract class BasicAction {
    public WebDriver driver;

    public BasicAction(WebDriver driver) {
        this.driver = driver;
    }
}
