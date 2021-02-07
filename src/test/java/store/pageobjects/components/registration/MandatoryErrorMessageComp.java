package store.pageobjects.components.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import store.pageobjects.BasicObject;

public class MandatoryErrorMessageComp extends BasicObject {

    @FindBy(className = "alert")
    public WebElement alertBox;

    @FindBy(xpath = ".//li[contains(text(), 'You must register at least one phone number.')]")
    public WebElement atLeastOnePhoneError;

    @FindBy(xpath = ".//li[contains(text(), \"The Zip/Postal code you've entered is invalid. It must follow this format: 00000\")]")
    public WebElement zipFormatError;

    @FindBy(xpath = ".//li[contains(text(), 'This country requires you to choose a State.')]")
    public WebElement stateError;

    @FindBy(css = ".alert > p")
    public WebElement totalErrors;

    public MandatoryErrorMessageComp(WebDriver driver) {
        super(driver);
    }

    public WebElement requiredField(String fieldName) {
        return alertBox.findElement(By.xpath(".//li[./b[contains(text(), '" + fieldName + "')] and contains(text(), ' is required')]"));
    }
}
