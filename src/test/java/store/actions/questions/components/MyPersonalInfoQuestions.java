package store.actions.questions.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import store.actions.BasicAction;
import store.actors.data.UserInfo;
import store.pageobjects.pages.MyPersonalInformationPage;

public class MyPersonalInfoQuestions extends BasicAction {

    private MyPersonalInformationPage myPersonalInformationPage;

    public MyPersonalInfoQuestions(WebDriver driver) {
        super(driver);
        this.myPersonalInformationPage = PageFactory.initElements(driver, MyPersonalInformationPage.class);
    }

    public void checkPersonalInfo(UserInfo userInfo) {
        Assert.assertEquals(this.myPersonalInformationPage.personalInfoBoxComp.firstName.getAttribute("value"), userInfo.getFirstName());
        Assert.assertEquals(this.myPersonalInformationPage.personalInfoBoxComp.lastName.getAttribute("value"), userInfo.getLastName());
        Assert.assertEquals(this.myPersonalInformationPage.personalInfoBoxComp.email.getAttribute("value"), userInfo.getEmail());
    }
}
