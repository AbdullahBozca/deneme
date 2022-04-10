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

    @FindBy(id = "account-menu")
    public WebElement insanFiguru;

    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement singIn;

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

    @FindBy(xpath = "//*[test()='Reset your password']")
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
}