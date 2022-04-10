package stepdefinitions.UIStepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;

public class StaffUIStepdefinitions {
    StaffPage sp = new StaffPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    String newId = "1212";
    String Ssn = "365-34-2321";

    @Then("My Pages menusune tiklar")
    public void MyPagesMenusuneTiklar() {
    Driver.waitAndClick(sp.myPagesLink,10);
    }

    @And("Search Patient secenegine tiklar")
    public void searchPatientSecenegineTiklar() {
        Driver.waitAndClick(sp.SearchPatientLink);
    }


    @And("hasta bilgilerinin gorulebildigini dogrular")
    public void hastaBilgilerininGorulebildiginiDogrular() {
        Assert.assertTrue(sp.Patient1.isDisplayed());
        Assert.assertTrue(sp.Patient2.isDisplayed());
        Assert.assertTrue(sp.Patient3.isDisplayed());
        Assert.assertTrue(sp.Patient4.isDisplayed());
    }

    @And("herhangi bir edit butonuna tiklar")
    public void herhangiBirEditButonunaTiklar() {
Driver.waitAndClick(sp.EditButton);
    }

    @And("{string} in duzenler")
    public void inDuzenlenebilirOldugunuDogrular(String str) {
        WebElement DegisecekElement = null;

        switch(str) {

            case "First Name":
                DegisecekElement = sp.FirstNameTextBox;
                Driver.waitAndClick(DegisecekElement);
                DegisecekElement.clear();
                Driver.waitAndSendText(DegisecekElement,faker.name().firstName());
                break;
            case "Last Name":
                DegisecekElement = sp.LastNameTextBox;
                Driver.waitAndClick(DegisecekElement);
                DegisecekElement.clear();
                Driver.waitAndSendText(DegisecekElement,faker.name().lastName());
                break;
            case "adress":
                DegisecekElement = sp.adressTextBox;
                Driver.waitAndClick(DegisecekElement);
                DegisecekElement.clear();
                Driver.waitAndSendText(DegisecekElement,faker.address().fullAddress());
                break;
            case "description":
                DegisecekElement = sp.descriptionTextBox;
                Driver.waitAndClick(DegisecekElement);
                DegisecekElement.clear();
                Driver.waitAndSendText(DegisecekElement,faker.howIMetYourMother().highFive());
                break;
                case "Email":
                DegisecekElement = sp.EmailTextBox;
                    Driver.waitAndClick(DegisecekElement);
                    DegisecekElement.clear();
                    Driver.waitAndSendText(DegisecekElement,faker.internet().emailAddress());
                break;
            case "Phone":
                DegisecekElement = sp.PhoneTextBox;
                Driver.waitAndClick(DegisecekElement);
                DegisecekElement.clear();
                Driver.waitAndSendText(DegisecekElement,"1587646490");
                break;
                case "BirthDate":
                DegisecekElement = sp.BirthDateTextBox;
                    Driver.waitAndClick(DegisecekElement);
                    DegisecekElement.clear();
                    actions.sendKeys("04.04.2022"+Keys.TAB).sendKeys("24:00").perform();
                break;
            case "Gender":
                DegisecekElement = sp.GenderTextBox;
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                select = new Select(DegisecekElement);
                select.selectByIndex(0);

                break;
            case "Blood Group":
                DegisecekElement = sp.BloodGroupTextBox;
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                select = new Select(DegisecekElement);
                select.selectByIndex(0);
                break;
                case "user":
                DegisecekElement = sp.userTextBox;
                    actions.sendKeys(Keys.PAGE_DOWN).perform();
                    select = new Select(DegisecekElement);
                    select.selectByIndex(5);
                break;
                case "country":
                DegisecekElement = sp.countryTextBox;
                    actions.sendKeys(Keys.PAGE_DOWN).perform();
                    select = new Select(DegisecekElement);
                    select.selectByVisibleText("Turkey");
                    break;
                case "State City":
                DegisecekElement = sp.cstateTextBox;
                    actions.sendKeys(Keys.PAGE_DOWN).perform();
                    select = new Select(DegisecekElement);
                    select.selectByIndex(0);
                    break;
        }
actions.sendKeys(Keys.PAGE_DOWN).perform();
}

    @Then("search textbox'ina ssn bilgisi girer")
    public void searchTextboxInaSsnBilgisiGirer() {
        Driver.waitAndSendText(sp.SearchTextBox,Ssn);
    }

    @And("cikan patient'in tum bilgilerinin dolduruldugunu gorur.")
    public void cikanPatientInTumBilgilerininDolduruldugunuGorur() {
        List<WebElement> HastaBilgiler = sp.getHastaBilgileri();
        for (int i = 0; i < HastaBilgiler.size(); i++) {

            Assert.assertFalse(HastaBilgiler.get(i).getText().isEmpty());

        }
    }

    @Then("{string}'ni temizler")
    public void niTemizler(String str) {

        WebElement SilinecekElement = null;

        switch(str) {
            case "First Name":
                SilinecekElement = sp.FirstNameTextBox;
                Driver.wait(3);
                SilinecekElement.clear();
                break;
            case "Last Name":
                SilinecekElement = sp.LastNameTextBox;
                Driver.wait(3);
                SilinecekElement.clear();
            case "adress":
                SilinecekElement = sp.adressTextBox;
                Driver.wait(3);
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                SilinecekElement.clear();
                break;
            case "description":
                SilinecekElement = sp.descriptionTextBox;
                Driver.wait(3);
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                SilinecekElement.clear();
                break;
              }
        Driver.wait(5);



    }


    @And("Save butonuna tiklar.")
    public void saveButonunaTiklar() {
        Driver.wait(3);
        Driver.waitAndClick(sp.saveButton);
    }

    @And("update isleminin gerceklestigi uyarisinin ciktigini dogrular")
    public void silinmeIslemindenSonraUyarisiCiktiginiDogrular() {
        Driver.waitForVisibility(sp.toastContainerUpdateMassage,5);
        Assert.assertTrue(sp.toastContainerUpdateMassage.isDisplayed());
    }

    @And("herhangi bir delete butonu olmadigini dogrular")
    public void herhangiBirDeleteButonuOlmadiginiDogrular() {
        try{Assert.assertFalse(sp.DeleteButton1.isDisplayed());}
        catch(Exception NoSuchElementException){
       Assert.assertFalse(false);
        }
        try{Assert.assertFalse(sp.DeleteButton2.isDisplayed());}
        catch(Exception NoSuchElementException){
       Assert.assertFalse(false);
        }}

    @Then("aranan ssne sahip patientin ciktigini test eder")
    public void arananSsneSahipPatientinCiktiginiTestEder() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(sp.getHastaBilgileri().get(1).getText().equals(Ssn));
    }

    @Then("aranan ssne sahip patientin essiz oldugunu test eder")
    public void arananSsneSahipPatientinEssizOldugunuTestEder() {

        List<WebElement> HastaSayisi = sp.getHastaSayisi();
        Assert.assertTrue(HastaSayisi.size()==1);
    }

    @And("id'yi duzenler")
    public void idYiDuzenler() {
        Driver.waitAndClick(sp.IdTextBox);

       try{ sp.IdTextBox.clear();}catch(Exception IOException){
           Assert.assertTrue(false);
        }
        Driver.waitAndSendText(sp.IdTextBox,newId);
    }

    @And("id'deki duzenlemenin gerceklestigini dogrular")
    public void idDekiDuzenlemeninGerceklestiginiDogrular() {
        Assert.assertTrue(sp.IdTextBox.getText().equals(newId));
    }

}

