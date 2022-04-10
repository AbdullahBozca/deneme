package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US08Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08StepDefinition {
    US08Page us08Page = new US08Page();
    WebElement strength;
    String passwordStr = "";
    String newPasswordStr = "";
    String usernameStr = "";

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));
    }

    @Then("account-menu iconuna tiklar")
    public void account_menu_iconuna_tiklar() {

        us08Page.accountWebElement.click();
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("kullanici sing in elementine tiklar")
    public void kullaniciSingInElementineTiklar() {

        us08Page.singInWebElement.click();
    }

    @And("Kullanici {string} girer")
    public void kullaniciGirer(String username) {
        usernameStr = username;
        us08Page.usernameTextBox.sendKeys(username);
    }


    @Then("Password butonuna tiklar")
    public void passwordButonunaTiklar() {

        us08Page.passwordButton.click();
    }

    @And("Kullanici gecerli {string} girer")
    public void kullaniciGecerliGirer(String password) {
        passwordStr = password;
        us08Page.passwordTextBox.sendKeys(password);
    }

    @And("kullanici sing in butonuna tiklar")
    public void kullaniciSingInButonunaTiklar() {
        us08Page.singInButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("New password confirmation yazisi gorulur")
    public void newPasswordConfirmationYazisiGorulur() {
        Assert.assertTrue(us08Page.newPasswordConfirmWebElement.isDisplayed());
    }


    @And("Password strength seviyesinin degistigi gorulmeli")
    public void passwordStrengthSeviyesininDegistigiGorulmeli() {
        Assert.assertTrue(us08Page.strengthBarWebElement.isDisplayed());
    }

    @And("New password text box sina {string} deger girilir")
    public void newPasswordTextBoxSinaDegerGirilir(String newPassword) {
        us08Page.currentPasswordTextBox.sendKeys(passwordStr);
        newPasswordStr = newPassword;
        us08Page.newPasswordTextBox.sendKeys(newPassword);
        us08Page.confirmPasswordTextBox.sendKeys(newPassword);
        ReusableMethods.waitFor(1);
    }

    @And("Yeni Password kaydedilmeli")
    public void yeniPasswordKaydedilmeli() {
        us08Page.saveButton.click();

    }

    @And("Password strength guclu seviyede oldugu gorulmeli")
    public void passwordStrengthGucluSeviyedeOlduguGorulmeli() {
        Assert.assertTrue(us08Page.strongStrengthBarWebElement.isDisplayed());
    }

    @And("kullanici account-menu butonuna tıklar")
    public void kullaniciAccountMenuButonunaTiklar() {

        us08Page.kullaniciAccountIconu.click();
    }
    @And("kullanici sing out elementine tiklar")
    public void kullaniciSingOutElementineTiklar() {
        us08Page.singOutButton.click();
    }
    @Then("Authentication information not connect. yazisi gorulur")
    public void authenticationInformationNotConnectYazisiGorulur() {
        Assert.assertTrue(us08Page.yanlisPasswordYazisi.isDisplayed());
        passwordReturn();

    }

    private void passwordReturn() {
        ReusableMethods.waitFor(1);
        us08Page.usernameTextBox.clear();
        us08Page.usernameTextBox.sendKeys(usernameStr);
        us08Page.passwordTextBox.clear();
        us08Page.passwordTextBox.sendKeys(newPasswordStr);
        us08Page.singInButton.click();
        us08Page.accountWebElement.click();
        us08Page.passwordButton.click();
        us08Page.currentPasswordTextBox.sendKeys(newPasswordStr);
        us08Page.newPasswordTextBox.sendKeys(passwordStr);
        us08Page.confirmPasswordTextBox.sendKeys(passwordStr);
        us08Page.saveButton.click();
        Driver.closeDriver();

    }

    @Then("kullanici account-menu iconuna tiklar")
    public void kullaniciAccountMenuIconunaTiklar() {
        us08Page.kullaniciAccountIconu.click();
        ReusableMethods.waitFor(1);
    }

    @And("Yeni Password kaydedilmelidir")
    public void yeniPasswordKaydedilmelidir() {
        us08Page.saveButton.click();
        us08Page.kullaniciAccountIconu.click();
        us08Page.singOutButton.click();
        us08Page.accountWebElement.click();
        us08Page.singInWebElement.click();
        passwordReturn();
    }


}