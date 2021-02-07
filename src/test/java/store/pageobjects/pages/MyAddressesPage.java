package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.pageobjects.components.myaccount.AddressBoxComp;

public class MyAddressesPage extends BasicPage{

    public AddressBoxComp addressBoxComp;

    public MyAddressesPage(WebDriver driver) {
        super(driver);
        this.url = this.BASE_URL + "?controller=addresses";
        this.addressBoxComp = PageFactory.initElements(driver, AddressBoxComp.class);
    }
}
