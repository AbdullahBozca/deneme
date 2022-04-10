package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08Page {
    public US08Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
//d-flex align-items-center dropdown-toggle nav-link
    public WebElement accountWebElement;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement singInWebElement;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement singInButton;

    @FindBy(xpath = "//span[contains(text(),'US08 ADMİN')]")
    public WebElement us08AdminWebElement;

    @FindBy(xpath = "//span[normalize-space()='Password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//label[@for='confirmPassword']")
    public WebElement newPasswordConfirmWebElement;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
    public WebElement strengthBarWebElement;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[2]")
    public WebElement strongStrengthBarWebElement;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordTextBox;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordTextBox;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement singOutButton;



    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement yanlisPasswordYazisi;
    //@FindBy(xpath = "//*[contains(text(), 'A Patient is updated with identifier')]")
    //public WebElement toastContainerMassage;

    @FindBy(id = "account-menu")
    public WebElement kullaniciAccountIconu;

}