package demosite.tests;

import demosite.actors.Anonymus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTests {
    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void startSelenium(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    // iFrame and tab handling
    @Test
    public void iFrameAndTab() {
        Anonymus anon = new Anonymus(driver);

        anon.navigatesToLandingPage();
        anon.clicksOnSeleniumLiveLink();
        anon.checksLiveSeleniumOnNewTab();
        anon.checksLiveSeleniumPageContent();
        anon.closesLiveSeleniumPage();
        anon.selectsMenuItem("Testing", "Selenium");
        anon.checksBigRedButton();
    }

    @AfterSuite(alwaysRun = true)
    public void stopSelenium(){
        driver.close();
    }
}
