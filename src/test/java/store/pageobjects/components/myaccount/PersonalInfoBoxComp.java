package store.pageobjects.components.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class PersonalInfoBoxComp extends BasicObject {

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    public PersonalInfoBoxComp(WebDriver driver) {
        super(driver);
    }
}
