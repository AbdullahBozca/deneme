package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US04_US07_Page;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US04_StepDefinition {
    US04_US07_Page us04_us07_page = new US04_US07_Page();
    WebElement strength;
    String passwordStr = "";



    @Then("gecerli {string} girer")
    public void gecerli_girer(String Str) {

    if (Str.equals("Username") ){
        us04_us07_page.loginUsername.sendKeys(Str);
    }else {
        us04_us07_page.loginPasword.sendKeys(Str);
    }

    }

    @Then("login sign in butonuna tiklar")
    public void login_sign_in_butonuna_tiklar() {
    us04_us07_page.loginSignIn.click();
    }

    @Then("{string} mesaji gorulur")
    public void mesaji_gorulur(String string) {
    Assert.assertTrue(us04_us07_page.welcomeToMedunna.isDisplayed());
    }

    @Then("gecersiz {string} girer")
    public void gecersizGirer(String Str) {
        if (Str.equals("Username") ){
            us04_us07_page.loginUsername.sendKeys(Str);
        }else {
            us04_us07_page.loginPasword.sendKeys(Str);
        }
    }

    @Then("{string} mesaji kontrol edilir")
    public void mesaji_kontrol_edilir(String string) {
        Assert.assertTrue(us04_us07_page.negatifLoginMesaji.isDisplayed());
    }

    @Then("{string} secenegi kontrol edilir")
    public void secenegi_kontrol_edilir(String string) {
        us04_us07_page.remenberMeButton.click();
    }

    @Then("Did you forget your password? butonuna tiklar")
    public void did_you_forget_your_password_butonuna_tiklar() {
    us04_us07_page.didYouForgetYourPasword.click();

    }
    @Then("Reset your password bilgisi kontrol eder")
    public void reset_your_password_bilgisi_kontrol_eder() {
        Assert.assertTrue(us04_us07_page.resetYourPassword.isDisplayed());

    }

    @Then("gecerli {string} adresini girer")
    public void gecerli_adresini_girer(String Str) {
        if (Str.equals("Username") ){
            us04_us07_page.loginUsername.sendKeys(Str);
        }else {
            us04_us07_page.requestEmail.sendKeys(Str);
        }

    }

    @Then("Cancel butonuna tiklar")
    public void cancel_butonuna_tiklar() {
         us04_us07_page.logincancel.click();
    }
/*
    @Then("Reset password butonuna tıklar")
    public void reset_password_butonuna_tıklar() {
        us04_us07_page.resetYourPassword.click();
    }
*/



    @Then("You don't have an account yet?... butotuna tıklar")
    public void you_don_t_have_an_account_yet_butotuna_tıklar() {

    }

    @Then("Registration \\(Kayit) yazisini kontrol eder")
    public void registration_kayit_yazisini_kontrol_eder() {

    }

    @Then("SSN kutusuna {string} girer")
    public void ssn_kutusuna_girer(String string) {

    }

    @Then("First Name kutusuna {string} girer")
    public void first_name_kutusuna_girer(String string) {

    }

    @Then("Last Name kutusuna {string} girer")
    public void last_name_kutusuna_girer(String string) {

    }
    @Then("Username kutusuna yeni {string} girer")
    public void username_kutusuna_yeni_girer(String string) {

    }
    @Then("Email kutusuna yeni {string} girer")
    public void email_kutusuna_yeni_girer(String string) {

    }

    @Then("New pasword kutusuna yeni {string} girer")
    public void new_pasword_kutusuna_yeni_girer(String string) {


    }

    @Then("New password confirmation kutusuna {string} tekrar girer")
    public void new_password_confirmation_kutusuna_tekrar_girer(String string) {


    }
    @Then("Register butonuna tiklar")
    public void register_butonuna_tiklar() {


    }
    @Then("{string} bilgisini kontrol eder")
    public void bilgisini_kontrol_eder(String string) {


    }

    @Then("Reset password butonuna tıklar")
    public void reset_password_butonuna_tıklar() {


    }


}
