package store.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.pageobjects.components.authentication.CreateAnAccountBoxComp;

public class SignInPage extends BasicPage{

    public CreateAnAccountBoxComp createAnAccountBox;

    public SignInPage(WebDriver driver) {
        super(driver);
        this.createAnAccountBox = PageFactory.initElements(driver, CreateAnAccountBoxComp.class);
    }

}
