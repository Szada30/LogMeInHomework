package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import store.actions.BasicAction;
import store.actors.data.AddressInfo;
import store.actors.data.UserInfo;
import store.pageobjects.pages.UserRegistrationPage;

public class UserRegistrationPageInteractions extends BasicAction {

    private UserRegistrationPage userRegistrationPage;

    public UserRegistrationPageInteractions(WebDriver driver) {
        super(driver);
        this.userRegistrationPage = PageFactory.initElements(driver, UserRegistrationPage.class);
    }

    public void registerWithMandatoryFields(AddressInfo addressInfo, UserInfo userInfo) {
        this.userRegistrationPage.newPersonalInformationBoxComp.firstName.sendKeys(userInfo.getFirstName());
        this.userRegistrationPage.newPersonalInformationBoxComp.lastName.sendKeys(userInfo.getLastName());
        this.userRegistrationPage.newPersonalInformationBoxComp.address1.sendKeys(addressInfo.getAddress1());
        this.userRegistrationPage.newPersonalInformationBoxComp.city.sendKeys(addressInfo.getCity());
        this.userRegistrationPage.newPersonalInformationBoxComp.postalCode.sendKeys(addressInfo.getPostalCode());
        this.userRegistrationPage.newPersonalInformationBoxComp.mobilePhone.sendKeys(addressInfo.getMobilePhone());
        this.userRegistrationPage.newPersonalInformationBoxComp.password.sendKeys(userInfo.getPassword());

        new Select(this.userRegistrationPage.newPersonalInformationBoxComp.state).selectByVisibleText(addressInfo.getState());
        new Select(this.userRegistrationPage.newPersonalInformationBoxComp.country).selectByVisibleText(addressInfo.getCountry());

        this.userRegistrationPage.newPersonalInformationBoxComp.registerButton.click();
    }


    public void doEmptyRegistration() {
        this.userRegistrationPage.newPersonalInformationBoxComp.registerButton.click();
    }
}
