package store.actors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.interactions.pages.*;
import store.actions.questions.components.MyAddressesQuestions;
import store.actions.questions.components.MyPersonalInfoQuestions;
import store.actors.data.AddressInfo;
import store.actors.data.UserInfo;

import java.io.FileReader;

public class User extends BasicActor{

    private UserInfo userInfo;
    private AddressInfo addressInfo;

    private SignInPageInteractions signInInteractions;
    private UserRegistrationPageInteractions registerInteractions;
    private MyPersonalInfoPageInteractions personalInfoPageInteractions;
    private MyAddressesPageInteractions addressesPageInteractions;
    private MyAddressesQuestions addressesQuestions;
    private MyPersonalInfoQuestions personalInfoQuestions;

    public User(String email, String dataPath, WebDriver driver) {
        super(driver);
        this.userInfo = new UserInfo(email, dataPath);
        this.addressInfo = new AddressInfo(dataPath);

        this.signInInteractions = new SignInPageInteractions(driver);
        this.registerInteractions = new UserRegistrationPageInteractions(driver);
        this.addressesPageInteractions = new MyAddressesPageInteractions(driver);
        this.personalInfoPageInteractions = new MyPersonalInfoPageInteractions(driver);

        this.addressesQuestions = new MyAddressesQuestions(driver);
        this.personalInfoQuestions = new MyPersonalInfoQuestions(driver);
    }

    public void goesToSignInPage() {
        this.landingInteractions.goToSignInPage();
    }

    public void createsNewAccount() {
        this.signInInteractions.createNewAccount(this.userInfo.getEmail());
    }

    public void registersWithMandatoryFields() {
        this.registerInteractions.registerWithMandatoryFields(this.addressInfo, this.userInfo);
    }

    public void checksAddressInfo() {
        this.addressesPageInteractions.navigateToMyAddresses();
        this.addressesQuestions.checkAddress(this.addressInfo);
    }

    public void checksPersonalInfo() {
        this.personalInfoPageInteractions.navigateToMyPersonalInfo();
        this.personalInfoQuestions.checkPersonalInfo(this.userInfo);
    }

}
