package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.US010_US011Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US11StepDefination {
    US010_US011Page page = new US010_US011Page();
    ReusableMethods ReusableMethods=new ReusableMethods();


    @Given("My Appointments sayfasinda sayfanin en alt kisminda Make an appointment linkine tiklar")
    public void my_appointments_sayfasinda_sayfanin_en_alt_kisminda_make_an_appointment_linkine_tiklar() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        page.makeAnAppointmentLinki.click();

    }

    @Given("First name, Last name,SSN,Email,Phone ve Appointment Date Time bilgileri doldurulur")
    public void first_name_last_name_ssn_email_phone_ve_appointment_date_time_bilgileri_doldurulur() {
        page.firstNameLinki.sendKeys("kaan");
        page.lastNameLinki.sendKeys("tasoglu");
        page.ssnLinki.sendKeys("001-45-0109");
        page.emailLinki.sendKeys("kaan@medunna.com");
        page.phoneLinki.sendKeys("5556543696");
        page.appoDatetimeLinki.sendKeys("20.04.2022");


    }

    @Given("Send an appointment request butonuna tiklanir")
    public void send_an_appointment_request_butonuna_tiklanir() {

    }

    @Then("Appointment registration saved mesaji goruntulendigi dogrulanmali")
    public void appointment_registration_saved_mesaji_goruntulendigi_dogrulanmali() {

    }

    @Then("Duzenlemek istedigi hastanin Edit butonuna tiklar")
    public void duzenlemek_istedigi_hastanin_edit_butonuna_tiklar() {

    }

    @Then("ilgili datayi guncelledikten sonra save butonuna tiklar")
    public void ilgili_datayi_guncelledikten_sonra_save_butonuna_tiklar() {

    }

    @Then("Patient id goruntulenebilir oldugu dogrulanmali")
    public void patient_id_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("Start Date Time goruntulenebilir oldugu dogrulanmali")
    public void start_date_time_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("End Date Time  goruntulenebilir oldugu dogrulanmali")
    public void end_date_time_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("Status  goruntulenebilir oldugu dogrulanmali")
    public void status_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("Physician  goruntulenebilir oldugu dogrulanmali")
    public void physician_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("Patient  goruntulenebilir oldugu dogrulanmali")
    public void patient_goruntulenebilir_oldugu_dogrulanmali() {

    }

    @Then("Anamnesis alanina ilgili data girilebilmelidir")
    public void anamnesis_alanina_ilgili_data_girilebilmelidir() {

    }

    @Then("Treatment  alanina ilgili data girilebilmelidir")
    public void treatment_alanina_ilgili_data_girilebilmelidir() {

    }

    @Then("Diagnosis  alanina ilgili data girilebilmelidir")
    public void diagnosis_alanina_ilgili_data_girilebilmelidir() {

    }

    @Then("save butonuna tiklar")
    public void save_butonuna_tiklar() {

    }

    @Then("Prescription ve Description alanlarina istege bagli olarak bilgi girilir")
    public void prescription_ve_description_alanlarina_istege_bagli_olarak_bilgi_girilir() {

    }


    @Then("Status seceneginde COMPLETED secilir")
    public void status_seceneginde_completed_secilir() {

    }


    @Then("The Appointment is update with identifier yazisinin goruntulendigini dogrulamali")
    public void the_appointment_is_update_with_identifier_yazisinin_goruntulendigini_dogrulamali() {

    }

    @Then("Status seceneginde PENDING secilir")
    public void status_seceneginde_pending_secilir() {

    }

    @Then("Status seceneginde CANCELED secilir")
    public void status_seceneginde_canceled_secilir() {

    }

}

