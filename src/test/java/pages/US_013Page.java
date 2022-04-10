package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_013Page {



    public US_013Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestElement;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatientLink;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement PatientKutucugunaTiklar;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSssNumarasiniYazar;

    @FindBy(xpath = "//span[contains(text(),'Show Appointments')]")
    public WebElement showAppointmentsButonu;

    @FindBy(xpath = "//span[contains(text(),'Show Tests')]")
    public WebElement showTestButonu;

    @FindBy(xpath = "//tbody/tr[2]/td[7]/div[1]/a[1]/span[1]")
    public WebElement viewResultsButonu;

    @FindBy(xpath = "//tbody/tr[8]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public WebElement glucoseTestinEditButonu;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement stafGuncellemeYaparSaveButonunaTiklar;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement ureaTestinEditButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement creatinineTestinEditButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement sodiumTestinEditButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement potassiumTestinEditButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement totalProteinTestinEditButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement hemoglobinTestinEditButonu;


    @FindBy(xpath = "//tbody/tr[1]/td[9]/div[1]/a[1]/span[1]/span[1]")
    public  WebElement albuminTestinEditButonu;


    @FindBy(xpath = "//span[text()='Test Results']")
    public WebElement testResultsYazisininGoruldugunuTestEder;


    @FindBy(xpath = "//button[normalize-space()='Request Inpatient']")
    public WebElement requestAInpatientButonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inpatientRequestAppointementsYazisininGoruldugunuTestEderYazisi;









}

