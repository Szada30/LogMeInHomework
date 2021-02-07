package store.actions.questions.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import store.actions.BasicAction;
import store.actors.data.UserInfo;
import store.pageobjects.components.registration.MandatoryErrorMessageComp;

public class MandatoryErrorMessageQuestions extends BasicAction {

    private MandatoryErrorMessageComp mandatoryErrorMessageComp;

    public MandatoryErrorMessageQuestions(WebDriver driver) {
        super(driver);
        this.mandatoryErrorMessageComp = PageFactory.initElements(driver, MandatoryErrorMessageComp.class);
    }

    public void checkNumberOfErrors(int numberOfError) {
        Assert.assertEquals(Integer.parseInt(this.mandatoryErrorMessageComp.totalErrors.getText().split(" ")[2]), numberOfError);
    }

    public void checkMissingPhoneError() {
        Assert.assertTrue(this.mandatoryErrorMessageComp.atLeastOnePhoneError.isDisplayed());
    }

    public void checkZipFormatError() {
        Assert.assertTrue(this.mandatoryErrorMessageComp.zipFormatError.isDisplayed());
    }

    public void checkMissingStateError() {
        Assert.assertTrue(this.mandatoryErrorMessageComp.stateError.isDisplayed());
    }

    public void checkMissingFieldError(String field) {
        Assert.assertTrue(this.mandatoryErrorMessageComp.requiredField(field).isDisplayed());
    }

}
