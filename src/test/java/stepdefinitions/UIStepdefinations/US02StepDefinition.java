package stepdefinitions.UIStepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPage;
import utilities.ReusableMethods;

import java.io.IOException;

public class US02StepDefinition {
    RegistrationPage registrationPage=new RegistrationPage();
    Faker faker = new Faker();

    @And("kullanici register elementine tiklar")
    public void kullaniciRegisterElementineTiklar() {
        registrationPage.registerWebElement.click();
    }

    @Given("Username kutusuna herhangi bir karakter girildiginde uyari cikmadigini test eder")
    public void usernameKutusunaHerhangiBirKarakterGirildigindeUyariCikmadiginiTestEder() throws IOException {
        registrationPage.usernameTextBox.sendKeys(faker.name().username());
        ReusableMethods.getScreenshot("hasan");
    }

    @Then("Bos birakildiginda Your username is required. yazisinin ciktigini test eder \\(Negative test)")
    public void bosBirakildigindaYourUsernameIsRequiredYazisininCiktiginiTestEderNegativeTest() {
        registrationPage.usernameTextBox.clear();
        registrationPage.usernameTextBox.sendKeys(Keys.SPACE);
        registrationPage.lastNameTextBox.click();
        Assert.assertTrue(registrationPage.usernameUyariWebElement.isDisplayed());
    }

    @Given("Email kutusuna @ ve . karakteri iceren bir String girer")
    public void emailKutusunaVeKarakteriIcerenBirStringGirer() {
        registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("Bu sekilde girilen email sonucunda uyari yazisi cikmadigini test eder")
    public void buSekildeGirilenEmailSonucundaUyariYazisiCikmadiginiTestEder() throws IOException {
        ReusableMethods.getScreenshot("dogru_email");
    }


    @And("{string} Bu karakterler girilmediginde This field is invalid yazisinin ciktigini test eder \\(Negative test)")
    public void buKarakterlerGirilmedigindeThisFieldIsInvalidYazisininCiktiginiTestEderNegativeTest(String email) {
        registrationPage.emailTextBox.clear();
        registrationPage.emailTextBox.sendKeys(email);
        Assert.assertTrue(registrationPage.emailUyariWebElement.isDisplayed());
    }

    @Given("Email kutusu bos birakildiginda Your email is required. yazisinin ciktigini test eder \\(Negative test)")
    public void emailKutusuBosBirakildigindaYourEmailIsRequiredYazisininCiktiginiTestEderNegativeTest() {
        registrationPage.emailTextBox.click();
        registrationPage.emailTextBox.sendKeys(Keys.SPACE);
        registrationPage.usernameTextBox.click();
        Assert.assertTrue(registrationPage.emailBosWebElement.isDisplayed());
    }
}
