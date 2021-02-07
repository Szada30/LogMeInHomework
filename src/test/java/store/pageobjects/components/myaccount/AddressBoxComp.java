package store.pageobjects.components.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class AddressBoxComp extends BasicObject {

    @FindBy(css = "li > span.address_name:nth-child(1)")
    public WebElement firstName;

    @FindBy(css = "li > span.address_name:nth-child(2)")
    public WebElement lastName;

    @FindBy(className = "address_address1")
    public WebElement address1;

    @FindBy(css = "ul.item.box > li:nth-child(5) > span:nth-child(1)")
    public WebElement city;

    @FindBy(css = "ul.item.box > li:nth-child(5) > span:nth-child(2)")
    public WebElement state;

    @FindBy(css = "ul.item.box > li:nth-child(5) > span:nth-child(3)")
    public WebElement postalCode;

    @FindBy(css = "ul.item.box > li:nth-child(6) > span")
    public WebElement country;

    @FindBy(className = "address_phone_mobile")
    public WebElement mobilePhone;

    public AddressBoxComp(WebDriver driver) {
        super(driver);
    }
}