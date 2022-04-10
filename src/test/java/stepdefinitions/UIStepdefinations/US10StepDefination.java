package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US010_US011Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10StepDefination {

    US010_US011Page page = new US010_US011Page();
    ReusableMethods rm=new ReusableMethods();



    @Given("insan ikonuna tiklar")
    public void insan_ikonuna_tiklar() {

        page.accountWebElement.click();
    }
    @And("sign in linkine tiklar")
    public void signInLinkineTiklar() {

        Driver.waitAndClick(page.singInLinki);
    }
    @And("Kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String username, String password) throws InterruptedException {
        page.usernameTextBox.sendKeys(username);
        page.passwordTextBox.sendKeys(password);

    }


    @Then("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
       Driver.waitAndClick(page.singInButton);

    }
    @Then("My Pages ve My Appointments linkine tiklar")
    public void my_pages_ve_my_appointments_linkine_tiklar() throws InterruptedException {
        page.myPagesLinki.click();
       Driver.waitAndClick(page.myAppointmentsLinki);


    }
    @Then("Tum randevularin gorunur oldugunu dogrular")
    public void tum_randevularin_gorunur_oldugunu_dogrular() throws InterruptedException {
        Assert.assertTrue(page.appointmentnsYazisi.isDisplayed());

           }

    //Tc02


    @Then("Patient id bilgisnin goruntulenebilir oldugunu dogrulamali")
    public void patientIdBilgisninGoruntulenebilirOldugunuDogrulamali() {

        page.patientId.isDisplayed();
        System.out.println("Patient id goruntulendi");
    }

    @And("Start Date bilgisinin goruntulenebilir oldugunu dogrulamali")
    public void startDateBilgisininGoruntulenebilirOldugunuDogrulamali() {

       Assert.assertTrue(page.startDateTimeLinki.isDisplayed());

    }
    @And("End Date bilgisnin goruntulenebilir oldugunu dogrulamali")
    public void endDateBilgisninGoruntulenebilirOldugunuDogrulamali() {
      Assert.assertTrue(page.endDateTimeLinki.isDisplayed());
    }

    @And("Status bilgisnin goruntulenebilir oldugunu dogrulamali")
    public void StatusBilgisninGoruntulenebilirOldugunuDogrulamali() {
      Assert.assertTrue(page.statusLinki.isDisplayed());
    }



}
