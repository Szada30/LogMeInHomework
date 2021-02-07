package store.actions.questions.support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisibleInViewport {
    private WebDriver driver;
    private String scriptBase =
            "var elem = arguments[0]," +
            "   box = elem.getBoundingClientRect();" +
            "return (" +
            "   box.top >= 0 &&" +
            "   box.left >= 0 &&" +
            "   box.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&" +
            "   box.right <= (window.innerWidth || document.documentElement.clientWidth)" +
            ");";

    public VisibleInViewport(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementInViewport(WebElement element) {
        return (Boolean)((JavascriptExecutor)this.driver).executeScript(this.scriptBase, element);
    }
}
