package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_US07_Page {
    public US04_US07_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasword;

    @FindBy(xpath = "//*[@id='rememberMe']")
    public WebElement remenberMeButton;

    @FindBy(linkText = "Did you forget your password?")
    public WebElement didYouForgetYourPasword;

    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Cancel')]")
    public WebElement logincancel;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement loginSignIn;

    @FindBy(xpath = "//*[@class='col-md-8']//span[contains(text(),'Reset your password')]")
    public WebElement resetYourPassword;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement requestEmail;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Reset password')]")
    public WebElement requestResetPassword;

    @FindBy(xpath = "//input[@id='remenberMe']//span[contains(text(),'Remenber me')]")
    public WebElement remenberMeYazisi;

    @FindBy(xpath = "//*[@class='container']//*[text()='Welcome to MEDUNNA']")
    public WebElement welcomeToMedunna;

    @FindBy (xpath = "//*[@class='Toastify']//*[text()='Authentication information not correct.']")
    public WebElement negatifLoginMesaji;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement newPasswordConfirm;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPassword;

    @FindBy (xpath="//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy (xpath="//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy (xpath="//input[@type='text']//following::input[4]")
    public WebElement usernameBox;

    @FindBy (xpath="//input[@type='text']//following::input[3]")
    public WebElement registerUsernameBox;

    @FindBy (xpath="//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy (xpath="//input[@id='email']")
    public WebElement emailBox;

    @FindBy (xpath="//*[@id='register-submit']")
    public WebElement registerButon;

    @FindBy (xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement registrationSavedYazisi;

    @FindBy (xpath="//*[@id='register-title']//span[contains(text(),'Registration')]")
    public WebElement registrationYazisi;


    @FindBy (xpath="//*[@class='alert alert-warning fade show']//span[contains(text(),'Register a new account')]")
    public WebElement registerANewAccount;

    @FindBy (xpath = "//*[@id='header']/div/div/div[4]/a")
    public WebElement makeAnAppointmenButon;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement appointmenFirstName;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement appointmenLastName;

    @FindBy (xpath = "//*[@id='ssn']")
    public WebElement appointmenSSN;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement appointmenEmail;

    @FindBy (xpath = "//input[@id='phone']")
    public WebElement appointmenPhone;

    @FindBy (xpath = "//input[@id='appoDate']")
    public WebElement appointmenGuncelTarih;





}