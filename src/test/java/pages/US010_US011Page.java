package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US010_US011Page {
    public US010_US011Page (){
    PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountWebElement;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement singInLinki;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement singInButton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesLinki;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointmentsLinki;

    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement appointmentnsYazisi;

    @FindBy (xpath="//span[text()='ID']")
    public WebElement patientId;

    @FindBy (xpath="//span[text()='Start DateTime']")
    public WebElement startDateTimeLinki;

    @FindBy (xpath="//span[text()='End DateTime']")
    public WebElement endDateTimeLinki;

    @FindBy (xpath="//span[text()='Status']")
    public WebElement statusLinki;

    // US011 LOCATE

    @FindBy (xpath="//a[text()='Make an appointment']")
    public WebElement makeAnAppointmentLinki;

    @FindBy (xpath="//input[@id='firstName']")
    public WebElement firstNameLinki;

    @FindBy (xpath="//input[@id='lastName']")
    public WebElement lastNameLinki;

    @FindBy (xpath="//input[@id='ssn']")
    public WebElement ssnLinki;

    @FindBy (xpath="//input[@id='email']")
    public WebElement emailLinki;

    @FindBy (xpath="//input[@id='phone']")
    public WebElement phoneLinki;


    @FindBy (xpath="//input[@id='appoDate']")
    public WebElement appoDatetimeLinki;

    @FindBy(xpath = "//*[contains(text(), 'Appointment registration saved! We will call you as soon as possible')]")
    public WebElement toastContainerNewPatient;

    @FindBy (xpath="//button[@class='btn btn-primary']")
    public WebElement sendAppointmentButton;

    @FindBy (xpath="//a[@class='btn btn-primary btn-sm']")
    public WebElement editButton;

    @FindBy (xpath="//textarea[@id='appointment-treatment']")
    public WebElement treatmentTextArea;

    @FindBy (xpath="//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy (xpath="//span[text()='Physician']")
    public WebElement physicianLink;

    @FindBy (xpath="//span[text()='Patient']")
    public WebElement patientLink;

    @FindBy (xpath="//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisTextArea;

    @FindBy (xpath="//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisTextArea;

    @FindBy (xpath="//textarea[@id='appointment-prescription']")
    public WebElement prescriptionTextArea;

    @FindBy (xpath="//textarea[@id='appointment-description']")
    public WebElement descriptionTextArea;

    @FindBy (xpath=" //select[@id='appointment-status']")
    public WebElement statusDropDown;















































}
