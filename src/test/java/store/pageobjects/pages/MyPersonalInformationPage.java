package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.pageobjects.components.myaccount.PersonalInfoBoxComp;

public class MyPersonalInformationPage extends BasicPage{

    public PersonalInfoBoxComp personalInfoBoxComp;

    public MyPersonalInformationPage(WebDriver driver) {
        super(driver);
        this.url = this.BASE_URL + "?controller=identity";
        this.personalInfoBoxComp = PageFactory.initElements(driver, PersonalInfoBoxComp.class);
    }
}
