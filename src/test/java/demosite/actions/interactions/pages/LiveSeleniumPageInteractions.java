package demosite.actions.interactions.pages;

import demosite.actions.BasicAction;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class LiveSeleniumPageInteractions extends BasicAction {
    public LiveSeleniumPageInteractions(WebDriver driver) {
        super(driver);
    }

    public void closeLiveSeleniumPage() {
        this.driver.close();
        this.driver.switchTo().window(new ArrayList<String>(this.driver.getWindowHandles()).get(0));
    }
}
