package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.BasicAction;
import store.pageobjects.pages.MyPersonalInformationPage;

public class MyPersonalInfoPageInteractions extends BasicAction {

    private MyPersonalInformationPage myPersonalInformationPage;

    public MyPersonalInfoPageInteractions(WebDriver driver) {
        super(driver);
        this.myPersonalInformationPage = PageFactory.initElements(driver, MyPersonalInformationPage.class);
    }

    public void navigateToMyPersonalInfo() {
        this.driver.get(this.myPersonalInformationPage.url);
    }
}
