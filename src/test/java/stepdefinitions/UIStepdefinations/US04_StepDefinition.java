package stepdefinitions.UIStepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US04_US07_Page;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US04_StepDefinition {
    US04_US07_Page us04_us07_page = new US04_US07_Page();
    WebElement strength;
    String passwordStr = "";

    private WebDriver driver;
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    String password=faker.internet().password();

//TC US04-01

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
        Driver.wait(5);
        Assert.assertTrue(us04_us07_page.welcomeToMedunna.isDisplayed());
    }

   // US04-TC 02

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


    // US-04-TC 03


    @Then("{string} secenegi kontrol edilir")
    public void secenegi_kontrol_edilir(String string) {
        us04_us07_page.remenberMeButton.click();
    }


    // US-04-TC 04

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

    @Then("Reset password butonuna tiklar")
    public void reset_password_butonuna_tiklar() {
        us04_us07_page.requestResetPassword.click();
    }


    // US04- TC 05

    @Then("You don't have an account yet?... butotuna tiklar")
    public void you_don_t_have_an_account_yet_butotuna_tiklar() {
    us04_us07_page.registerANewAccount.click();

    }
/*
    @Then("kullanici {string} , {string} , {string} , {string} , {string} , {string} , {string}  girer")
    public void kullanici_girer(String ssn, String Firstname, String Lastname, String Username, String Email, String Password, String DogrulamaPassword) {
       us04_us07_page.ssnBox.sendKeys(ssn);
       us04_us07_page.firstNameBox.sendKeys(Firstname);
       us04_us07_page.lastNameBox.sendKeys(Lastname);
       us04_us07_page.registerUsernameBox.sendKeys(Username);
       us04_us07_page.emailBox.sendKeys(Email);
       us04_us07_page.newPassword.sendKeys(Password);
       us04_us07_page.newPasswordConfirm.sendKeys(DogrulamaPassword);

    }

*/

    @Then("kullanici {string} , {string} , {string} , {string} , {string} , {string} , {string}  girer")
    public void kullanici_girer(String ssn, String Firstname, String Lastname, String Username, String Email, String Password, String DogrulamaPassword) {

        us04_us07_page.ssnBox.click();
        actions.sendKeys(faker.idNumber().ssnValid())

                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).perform();
        us04_us07_page.newPassword.sendKeys(Password);
        us04_us07_page.newPasswordConfirm.sendKeys(DogrulamaPassword);

    }



    @Then("Register butonuna tiklar")
    public void register_butonuna_tiklar() {
    us04_us07_page.registerButon.click();

    }
    @Then("{string} bilgisini kontrol eder")
    public void bilgisini_kontrol_eder(String string) {
        Driver.wait(5);
        Assert.assertTrue(us04_us07_page.registrationSavedYazisi.isDisplayed());
    }


    // US04- TC 06

    @Then("Cancel butonuna tiklar")
    public void cancel_butonuna_tiklar() {
        us04_us07_page.logincancel.click();
    }


    //US07- TC 01


    @Then("Make an Appointment butonuna tiklar")
    public void make_an_appointment_butonuna_tiklar() {
    us04_us07_page.makeAnAppointmenButon.click();

    }

    @Then("kullanici {string} , {string} , {string} , {string} , {string} , {string}  girer")
    public void kullanici_girer(String Firstname, String Lastname, String ssn, String Email, String Phone, String GuncelTarih) {
    us04_us07_page.appointmenFirstName.sendKeys(Firstname);
    us04_us07_page.appointmenLastName.sendKeys(Lastname);
    us04_us07_page.appointmenSSN.sendKeys(ssn);
    us04_us07_page.appointmenEmail.sendKeys(Email);
    us04_us07_page.appointmenPhone.sendKeys(Phone);
    us04_us07_page.appointmenGuncelTarih.sendKeys(GuncelTarih);

    }

    @Then("Send an Appointment Request butonuna tiklar")
    public void send_an_appointment_request_butonuna_tiklar() {
    }

    @Then("{string} basari mesajini kontrol eder")
    public void basari_mesajini_kontrol_eder(String string) {


    }






}
