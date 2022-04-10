package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StaffPage {
    public StaffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesLink;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement SearchPatientLink;

    @FindBy(xpath = "(//tbody/tr)[1]")
    public WebElement Patient1;

    @FindBy(xpath = "(//tbody/tr)[2]")
    public WebElement Patient2;

    @FindBy(xpath = "(//tbody/tr)[3]")
    public WebElement Patient3;

    @FindBy(xpath = "(//tbody/tr)[4]")
    public WebElement Patient4;

    @FindBy(xpath = "(//*[text()='Edit'])[3]")
    public WebElement EditButton;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement IdTextBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement FirstNameTextBox;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastNameTextBox;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement BirthDateTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement EmailTextBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement PhoneTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement GenderTextBox;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement BloodGroupTextBox;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userTextBox ;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryTextBox;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement cstateTextBox;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement SearchTextBox;


    @FindBy(xpath = "//*[contains(text(), 'A Patient is updated with identifier')]")
    public WebElement toastContainerUpdateMassage;

    @FindBy(xpath= "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='DELETE']")
    public WebElement DeleteButton1;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement DeleteButton2;
    public List<WebElement> getHastaBilgileri() {
        List<WebElement> hastabilgileri = Driver.getDriver().findElements(By.xpath("//tbody/tr/td"));

return hastabilgileri;
    }
    public List<WebElement> getHastaSayisi() {
        List<WebElement> hastaSayisi = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[1]"));

return hastaSayisi;
    }
   // @FindBy(xpath = "//*[contains(text(), 'A Patient is updated with identifier')]")
  //  public WebElement toastContainerMassage;
}
