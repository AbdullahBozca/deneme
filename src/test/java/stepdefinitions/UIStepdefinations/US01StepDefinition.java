package stepdefinitions.UIStepdefinations;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class US01StepDefinition {

    Registrant registrant = new Registrant();
    RegistrationPage registrationPage=new RegistrationPage();
Actions actions;
    //Faker faker = new Faker();
    RegistrationPage rp = new RegistrationPage();
//background stepdefinitions
@And("kullanici register sayfasina tiklar")
public void kullaniciRegisterSayfasinaTiklar() {
    rp.accountMenu.click();
    rp.Register.click();

}
//======================================================================
   //TC01
    @Given("kullanici  gecerli SSN girilmesini saglar ve hata gormedigini test eder")
    public void kullanici_gecerli_ssn_girilmesini_saglar_ve_hata_gormedigini_test_eder() {
        Driver.waitAndSendText(rp.ssnTextBox,gecerliSSNUret());
        Driver.waitAndClick(rp.firstNameTextBox);
        try {
            Assert.assertTrue(rp.invalidSsnFeedback.isDisplayed());

        } catch (Exception e) {
            System.out.println("SSN gecerli.");
        }



    }
    @Then("Registration sayfasinda bu isaretler girilmeden  SSN kutucuguna ucuncu ve besinci rakamdan sonra - ozel isareti konulmadiginda uyari yazisi ciktigini test eder")
    public void registration_sayfasinda_bu_isaretler_girilmeden_ssn_kutucuguna_ucuncu_ve_besinci_rakamdan_sonra_ozel_isareti_konulmadiginda_uyari_yazisi_ciktigini_test_eder() {
        rp.ssnTextBox.clear();
        Driver.waitAndSendText(rp.ssnTextBox,gecersizSSNUret());
        Driver.waitAndClick(rp.firstNameTextBox);
        Assert.assertTrue(rp.invalidSsnFeedback.isDisplayed());


    }
//================================================================================
    //TC02
@And("Ssn bos birakildiginda Your SSN is required. yazisinin ciktigini test eder")
public void ssnBosBirakildigindaYourSSNIsRequiredYazisininCiktiginiTestEder() {
    rp.ssnTextBox.sendKeys(Keys.SPACE);
    Driver.waitAndClick(rp.firstNameTextBox);
    Assert.assertTrue(rp.yourSSNisRequired.isDisplayed());

}
    //================================================================================
//TC 03
    @Given("And firstname kutusuna herhangi bir karakter girdiginde uyari yazisi cikmadigini test eder")
    public void and_firstname_kutusuna_herhangi_bir_karakter_girdiginde_uyari_yazisi_cikmadigini_test_eder() {
        String firstName=Faker.instance().name().firstName();
        Driver.waitAndSendText(rp.ssnTextBox,gecerliSSNUret());
        Driver.waitAndSendText(rp.firstNameTextBox,firstName);
        Driver.waitAndClick(rp.lastNameTextBox);
        try {Assert.assertFalse(rp.invalidFirstNameFeedback.isDisplayed());

        }catch (Exception e) {
            System.out.println("Firstname gecerli.");
        }



    }

    @Given("firstname bos birakildiginda Your FirstName is required. yazisinin ciktigini test eder")
    public void firstname_bos_birakildiginda_your_first_name_is_required_yazisinin_ciktigini_test_eder() {
        Driver.waitAndSendText(rp.ssnTextBox,gecerliSSNUret());
        rp.firstNameTextBox.sendKeys(Keys.SPACE);
        Driver.waitAndClick(rp.lastNameTextBox);
        Assert.assertTrue(rp.invalidFirstNameFeedback.isDisplayed());
    }
//===============================================================================================
    //TC04
@Then("lastname kutusuna herhangi bir karakter girdiginde uyari yazisi cikmadigini test eder")
public void lastname_kutusuna_herhangi_bir_karakter_girdiginde_uyari_yazisi_cikmadigini_test_eder() {
    actions=new Actions(Driver.getDriver());
    String firstName=Faker.instance().name().firstName();
    rp.ssnTextBox.clear();
    Driver.waitAndSendText(rp.ssnTextBox,gecerliSSNUret());
    rp.firstNameTextBox.clear();
    Driver.waitAndSendText(rp.firstNameTextBox,firstName);


    String lastName=Faker.instance().name().lastName();
    rp.lastNameTextBox.clear();
    Driver.waitAndSendText(rp.lastNameTextBox,lastName);
    actions.sendKeys(Keys.PAGE_DOWN);
    Driver.wait(1);
    actions.sendKeys(Keys.PAGE_DOWN);
    Driver.wait(1);
    Driver.waitAndClick(rp.usernameTextBox);
    try {Assert.assertFalse(rp.invalidLastNameFeedback.isDisplayed());

    }catch (Exception e) {
        System.out.println("Lastname gecerli.");
    }

}
    @Then("lastname  bos birakildiginda Your LastName is required. yazisinin ciktigini test eder")
    public void lastname_bos_birakildiginda_your_last_name_is_required_yazisinin_ciktigini_test_eder() {

    rp.ssnTextBox.clear();
        Driver.waitAndSendText(rp.ssnTextBox,gecerliSSNUret());
        String firstName=Faker.instance().name().firstName();

        Driver.waitAndSendText(rp.firstNameTextBox,firstName);
        Driver.waitAndClick(rp.lastNameTextBox);
        rp.lastNameTextBox.sendKeys(Keys.SPACE);
        Driver.waitAndClick(rp.emailTextBox);
        rp.emailTextBox.click();
        try {
            Assert.assertTrue(rp.invalidLastNameFeedback.isDisplayed());
        }catch (Exception e) {
            System.out.println("Lastname gecerli.");
        }

    }
//========================================================================================





    public String gecerliSSNUret (){
        Faker faker = new Faker();
        int part1=faker.number().numberBetween(111,999);
        System.out.println("part1 = " + part1);
        int part2=faker.number().numberBetween(11,99);
        System.out.println("part2 = " + part2);
        int part3=faker.number().numberBetween(1111,9999);
        System.out.println("part3 = " + part3);
        String SSN=part1+"-"+part2+"-"+part3;
        System.out.println("SSN = " + SSN);
        return SSN;

    }
    public String gecersizSSNUret(){
        Faker faker = new Faker();
        int wrongSSN=faker.number().numberBetween(000000001,999999999);
        String SSN= String.valueOf(wrongSSN);
        return SSN;

    }



}
