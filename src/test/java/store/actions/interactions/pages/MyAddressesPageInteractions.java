package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.BasicAction;
import store.pageobjects.pages.MyAddressesPage;

public class MyAddressesPageInteractions extends BasicAction {

    private MyAddressesPage myAddressesPage;

    public MyAddressesPageInteractions(WebDriver driver) {
        super(driver);
        this.myAddressesPage = PageFactory.initElements(driver, MyAddressesPage.class);
    }

    public void navigateToMyAddresses() {
        this.driver.get(this.myAddressesPage.url);
    }
}
