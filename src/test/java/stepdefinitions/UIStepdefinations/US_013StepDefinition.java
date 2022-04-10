package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.US_012Page;
import pages.US_013Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013StepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    US_013Page us013Page = new US_013Page();
    utilities.ReusableMethods ReusableMethods=new ReusableMethods();
//hasta ID=268-25-8485

    @And("Search patient butonuna tiklar")
    public void searchPatientButonunaTiklar() {
        us013Page.searchPatientLink.click();

        }
    @Then("Patient SSN kutucuguna hastanin SSN numarasini yazar")
    public void patientSSNKutucugunaHastaninSSNNumarasiniYazar() {
        us013Page.patientSssNumarasiniYazar.sendKeys("268-25-8485");

        }

    @And("Show appointments butonuna tiklar")
    public void showAppointmentsButonunaTiklar() {
        us013Page.showAppointmentsButonu.click();
    }

    @And("Show tests butonuna tiklar")
    public void showTestsButonunaTiklar() {
        us013Page.showTestButonu.click();
    }

    @And("View results butonuna tiklar")
    public void viewResultsButonunaTiklar() {
        us013Page.viewResultsButonu.click();
    }

    @And("Glucose testin Edit butonuna tiklar")
    public void glucoseTestinEditButonunaTiklar() {
        us013Page.glucoseTestinEditButonu.click();
    }

    @And("Staf guncelleme yapar Save butonuna tiklar")
    public void stafGuncellemeYaparSaveButonunaTiklar() {
        us013Page.stafGuncellemeYaparSaveButonunaTiklar.click();

    }

    @And("Urea testin Edit butonuna tiklar")
    public void ureaTestinEditButonunaTiklar() {
        us013Page.ureaTestinEditButonu.click();
    }


    @And("Creatinine testin Edit butonuna tiklar")
    public void creatinineTestinEditButonunaTiklar() {
        us013Page.creatinineTestinEditButonu.click();
    }

    @And("Sodium testin Edit butonuna tiklar")
    public void sodiumTestinEditButonunaTiklar() {
        us013Page.sodiumTestinEditButonu.click();
    }

    @And("Potasium testin Edit butonuna tiklar")
    public void potasiumTestinEditButonunaTiklar() {
        us013Page.potassiumTestinEditButonu.click();
    }

    @And("Total protein testin Edit butonuna tiklar")
    public void totalProteinTestinEditButonunaTiklar() {
        us013Page.totalProteinTestinEditButonu.click();
    }

    @And("Albumin testin Edit butonuna tiklar")
    public void albuminTestinEditButonunaTiklar() {
        us013Page.albuminTestinEditButonu.click();

    }

    @And("Hemoglobin testin Edit butonuna tiklar")
    public void hemoglobinTestinEditButonunaTiklar() {
        us013Page.hemoglobinTestinEditButonu.click();
    }

    @And("Show Test Results butonuna tiklar")
    public void showTestResultsButonunaTiklar() {

        Driver.waitAndClick(us013Page.showTestElement);

        //us013Page.showTestButonu.click();
    }



    @And("Test Results yazisinin goruldugunu test eder")
    public void testResultsYazisininGoruldugunuTestEder() {
        Assert.assertTrue(us013Page.testResultsYazisininGoruldugunuTestEder.isDisplayed());


    }

    @And("Request a inpatient butununa tiklar")
    public void requestAInpatientButununaTiklar() {

        Driver.wait(5);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", us013Page.requestAInpatientButonu);
        Driver.wait(3);
    }


    @And("Inpatient request appointements  yazisinin goruldugunu test eder")
    public void inpatientRequestAppointementsYazisininGoruldugunuTestEder() {
        Assert.assertTrue(us013Page.inpatientRequestAppointementsYazisininGoruldugunuTestEderYazisi.isDisplayed());
    }
}
