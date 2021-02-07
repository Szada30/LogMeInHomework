package store.actions.questions.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import store.actions.BasicAction;
import store.actors.data.AddressInfo;
import store.pageobjects.pages.MyAddressesPage;

public class MyAddressesQuestions extends BasicAction {

    private MyAddressesPage myAddressesPage;

    public MyAddressesQuestions(WebDriver driver) {
        super(driver);
        this.myAddressesPage = PageFactory.initElements(driver, MyAddressesPage.class);
    }

    public void checkAddress(AddressInfo addressInfo) {
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.firstName.getText(), addressInfo.getFirstName());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.lastName.getText(), addressInfo.getLastName());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.address1.getText(), addressInfo.getAddress1());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.city.getText().replace(",", ""), addressInfo.getCity());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.state.getText(), addressInfo.getState());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.postalCode.getText(), addressInfo.getPostalCode());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.country.getText(), addressInfo.getCountry());
        Assert.assertEquals(this.myAddressesPage.addressBoxComp.mobilePhone.getText(), addressInfo.getMobilePhone());
    }
}
