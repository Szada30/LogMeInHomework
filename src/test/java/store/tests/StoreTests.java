package store.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import store.actors.Anonymus;
import store.actors.User;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StoreTests {
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

    @BeforeMethod
    public void cleanup(){
        // Logout
        driver.manage().deleteAllCookies();
    }

    // Automate User Registration Process
    @Test
    public void userRegistration() {
        User grug = new User(
                new Random().nextInt() + "@test.com",
                "src/test/resources/UserData.json",
                driver);

        grug.navigatesToLandingPage();
        grug.goesToSignInPage();
        grug.createsNewAccount();
        grug.registersWithMandatoryFields();
        grug.checksAddressInfo();
        grug.checksPersonalInfo();
    }

    // Verify error message for mandatory fields
    @Test
    public void mandatoryErrorMessage() {
        Anonymus anon = new Anonymus(driver);

        anon.navigatesToLandingPage();
        anon.goesToSignInPage();
        anon.initiatesNewAccountCreation();
        anon.doesEmptyRegistration();
        anon.checksEmptyRegistrationErrorMessage();
    }

    // Scroll down with Javascript
    @Test
    public void scrollToFooter() {
        Anonymus anon = new Anonymus(driver);

        anon.navigatesToLandingPage();
        anon.scrollsLikeAnAbsolutMadLad();
        anon.checksIfFooterVisible();
    }

    @AfterSuite(alwaysRun = true)
    public void stopSelenium(){
        driver.close();
    }

}
