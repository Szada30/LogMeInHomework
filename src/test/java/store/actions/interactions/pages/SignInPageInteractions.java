package store.actions.interactions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.BasicAction;
import store.pageobjects.pages.SignInPage;

public class SignInPageInteractions extends BasicAction {

    private SignInPage signInPage;

    public SignInPageInteractions(WebDriver driver) {
        super(driver);
        this.signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    public void createNewAccount(String email) {
        this.signInPage.createAnAccountBox.emailInput.sendKeys(email);
        this.signInPage.createAnAccountBox.createAccountButton.click();
    }

}
