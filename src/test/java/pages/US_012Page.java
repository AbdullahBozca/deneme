package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_012Page {
    public void scrollToWebelementVisible(WebElement webElement){
        JavascriptExecutor jss= (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);",webElement);
    }


    public US_012Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'US08 ADMİN')]")
    public WebElement us08AdminWebElement;

    @FindBy(xpath = "//span[normalize-space()='Password']")
    public WebElement passwordButton;



    @FindBy (xpath="//span[text()='MY PAGES']")
    public WebElement myPagesButtonElement;



    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;


    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    public  WebElement hastaEdit;

    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div[1]/div/div[1]/a")
    public  WebElement requestButtonu;

    @FindBy(xpath = "//h2[@id='c-test-item-heading']")
    public WebElement itemsYazisi;


    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement singOutButton;


    @FindBy(xpath = "//input[@id='1402']")
    public WebElement ureaButonu;

    @FindBy(xpath = "//input[@id='1403']")
    public WebElement creatinineButonu;

    @FindBy(xpath = "//input[@id='1404']")
    public WebElement SodiumButonu;

    @FindBy(xpath = "//input[@id='1405']")
    public WebElement potassiumButonu;

    @FindBy(xpath = "//input[@id='1406']")
    public WebElement totalProteinButonu;

    @FindBy(xpath = "//input[@id='1408']")
    public WebElement HemoglobinButonu;

    @FindBy(xpath = "//input[@id='1407']")
    public WebElement albuminButonu;

    @FindBy(xpath = "//input[@id='1401']")
    public WebElement glucoseButonu;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement saveButtonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement aNewIsCreatedWithIdentifierGorulduYazisi;












    }



