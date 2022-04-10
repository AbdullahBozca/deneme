package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Register')]")
    public WebElement registerWebElement;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement usernameUyariWebElement;

    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement emailUyariWebElement;

    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailBosWebElement;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@name='firstPassword']")
    public WebElement firstPasswordTextBox;

    @FindBy(xpath = "//*[@name='secondPassword']")
    public WebElement secondPasswordTextBox;

    @FindBy(xpath = "//*[@id='strengthBar']")
    public WebElement strengthBar;

    @FindBy(xpath = "(//*[@class='point'])[1]")
    public WebElement strengthPoint1;

    @FindBy(xpath = "(//*[@class='point'])[2]")
    public WebElement strengthPoint2;

    @FindBy(xpath = "(//*[@class='point'])[3]")
    public WebElement strengthPoint3;

    @FindBy(xpath = "(//*[@class='point'])[4]")
    public WebElement strengthPoint4;

    @FindBy(xpath = "(//*[@class='point'])[5]")
    public WebElement strengthPoint5;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(), 'Registration Saved')]")
    public WebElement toastContainerMassage;

    @FindBy(xpath = "//*[@id='register-title']")
    public WebElement registrationTitle;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement invalidSsnFeedback;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement invalidfeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement invalidFirstNameFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement invalidLastNameFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement invalidUsernameFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement invalidEmailFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement invalidPassword1Feedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement invalidPassword2Feedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement invalidPasswordFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])")
    public WebElement generalInvalidFeedback;



    //==============================HASAN==========================
    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement yourSSNisRequired;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement Register;


}