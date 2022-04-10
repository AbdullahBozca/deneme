package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.US08Page;
import pages.US_012Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_012StepDefinitions {
    Actions actions = new Actions(Driver.getDriver());
    US_012Page us012Page = new US_012Page();


    @And("My Page menusune tiklar")
    public void myPageMenusuneTiklar() {
        Driver.wait(2);
        us012Page.myPagesButtonElement.click();
        Driver.wait(3);
    }
    @And("My appointements butonuna tiklar")
    public void myAppointementsButonunaTiklar() {

        us012Page.myAppointments.click();

        Driver.wait(2);
    }
    @And("Hastasini secip Edit butonuna tiklar")
    public void hastasiniSecipEditButonunaTiklar(){
        us012Page.hastaEdit.click();
    }

    @And("Request a test butununa tiklar")
    public void requestATestButununaTiklar() {
        Driver.wait(5);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", us012Page.requestButtonu);
        Driver.wait(3);





    }

    @And("Test Items yazisinin goruldugunu test eder")
    public void testItemsYazisininGoruldugunuTestEder() {
        Assert.assertTrue(us012Page.itemsYazisi.isDisplayed());


    }




    @And("Secilen testlerin sag taraftaki butonlarina tiklar")
    public void secilenTestlerinSagTaraftakiButonlarinaTiklar() {
        us012Page.ureaButonu.click();
        us012Page.creatinineButonu.click();
        us012Page.SodiumButonu.click();
        us012Page.potassiumButonu.click();
        us012Page.totalProteinButonu.click();
        us012Page.HemoglobinButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us012Page.scrollToWebelementVisible(us012Page.albuminButonu);
        Driver.waitAndClick(us012Page.albuminButonu);
        Driver.wait(3);
        us012Page.scrollToWebelementVisible(us012Page.glucoseButonu);
        Driver.waitAndClick(us012Page.glucoseButonu);
        Driver.wait(3);


    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        us012Page.scrollToWebelementVisible(us012Page.saveButtonu);
        Driver.waitAndClick(us012Page.saveButtonu);
        Driver.wait(3);
        //us012Page.saveButtonu.click();
        
    }

    @And("A new  is created  with identifier  yazisinin goruldugunu test eder") // "Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin"
    public void aNewIsCreatedWithIdentifierYazisininGoruldugunuTestEder() {
       Assert.assertTrue("A new  is created  with identifier  yazisi goruldu",us012Page.aNewIsCreatedWithIdentifierGorulduYazisi.isDisplayed());

    }



}
