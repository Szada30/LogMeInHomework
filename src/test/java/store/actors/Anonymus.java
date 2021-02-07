package store.actors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import store.actions.interactions.pages.SignInPageInteractions;
import store.actions.interactions.pages.SiteWideInteractions;
import store.actions.interactions.pages.UserRegistrationPageInteractions;
import store.actions.questions.components.FooterQuestions;
import store.actions.questions.components.MandatoryErrorMessageQuestions;

import java.util.Random;

public class Anonymus extends BasicActor{

    private UserRegistrationPageInteractions userRegistrationPageInteractions;
    private SignInPageInteractions signInInteractions;
    private SiteWideInteractions siteWideInteractions;

    private MandatoryErrorMessageQuestions mandatoryErrorMessageQuestions;
    private FooterQuestions footerQuestions;

    public Anonymus(WebDriver driver) {
        super(driver);
        this.userRegistrationPageInteractions = new UserRegistrationPageInteractions(driver);
        this.signInInteractions = new SignInPageInteractions(driver);
        this.siteWideInteractions = new SiteWideInteractions(driver);

        this.mandatoryErrorMessageQuestions = new MandatoryErrorMessageQuestions(driver);
        this.footerQuestions = new FooterQuestions(driver);
    }

    public void goesToSignInPage() {
        this.landingInteractions.goToSignInPage();
    }

    public void doesEmptyRegistration() {
        this.userRegistrationPageInteractions.doEmptyRegistration();
    }

    public void initiatesNewAccountCreation() {
        this.signInInteractions.createNewAccount(new Random().nextInt() + "@test.com");
    }

    public void checksEmptyRegistrationErrorMessage() {
        this.mandatoryErrorMessageQuestions.checkNumberOfErrors(8);
        this.mandatoryErrorMessageQuestions.checkMissingPhoneError();
        this.mandatoryErrorMessageQuestions.checkZipFormatError();
        this.mandatoryErrorMessageQuestions.checkMissingStateError();
        this.mandatoryErrorMessageQuestions.checkMissingFieldError("lastname");
        this.mandatoryErrorMessageQuestions.checkMissingFieldError("firstname");
        this.mandatoryErrorMessageQuestions.checkMissingFieldError("passwd");
        this.mandatoryErrorMessageQuestions.checkMissingFieldError("address1");
        this.mandatoryErrorMessageQuestions.checkMissingFieldError("city");
    }

    public void scrollsLikeAnAbsolutMadLad() {
        this.siteWideInteractions.scrollToFooterBy100Pixel();
    }

    public void checksIfFooterVisible() {
        this.footerQuestions.isFooterVisible();
    }
}
