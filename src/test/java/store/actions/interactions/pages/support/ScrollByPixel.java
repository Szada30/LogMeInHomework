package store.actions.interactions.pages.support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollByPixel {

    private WebDriver driver;
    private String scriptBase = "window.scrollBy(VERTICAL,HORIZONTAL)";

    public ScrollByPixel(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollByPixelVertically(int pixelAmount) {
        String script = this.scriptBase
                .replace("VERTICAL", String.valueOf(pixelAmount))
                .replace("HORIZONTAL", "0");

        ((JavascriptExecutor)this.driver).executeScript(script);
    }

    public void scrollByPixelHorizontally(int pixelAmount) {
        String script = this.scriptBase
                .replace("HORIZONTAL", String.valueOf(pixelAmount))
                .replace("VERTICAL", "0");

        ((JavascriptExecutor)this.driver).executeScript(script);
    }

}
