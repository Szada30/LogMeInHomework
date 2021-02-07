package store.pageobjects.components.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class CreateAnAccountBoxComp extends BasicObject {

    @FindBy(id = "email_create")
    public WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    public CreateAnAccountBoxComp(WebDriver driver) {
        super(driver);
    }
}
