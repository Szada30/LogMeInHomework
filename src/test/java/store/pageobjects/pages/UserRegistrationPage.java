package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.pageobjects.components.registration.NewPersonalInformationBoxComp;

public class UserRegistrationPage extends BasicPage{

    public NewPersonalInformationBoxComp newPersonalInformationBoxComp;

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
        this.newPersonalInformationBoxComp = PageFactory.initElements(driver, NewPersonalInformationBoxComp.class);
    }
}
