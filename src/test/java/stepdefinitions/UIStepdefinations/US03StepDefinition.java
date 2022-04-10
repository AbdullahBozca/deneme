package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US03_Pages;
import utilities.Driver;


public class US03StepDefinition {

static US03_Pages us03=new US03_Pages();
static Actions actions=new Actions(Driver.getDriver());

@Then("Kullanici Register Sayfasina Gider")
public void kullaniciRegisterSayfasinaGider() {
   us03.newPasswordBoxGo();
}

@And("TCBir Kullanici dort karakter halinde {string} girer Ardindan Kullanici sifre tablo renginin bir oldugunu dogrular")
public void kullaniciDortKarakterHalindeGirerArdindanKullaniciSifreTabloRengininBirOldugunuDogrular(String password) {
    us03.sayfayiAyarla();
    us03.newPasswordBox.sendKeys(password);
    us03.newPasswordBox.clear();
    Assert.assertTrue("Ilk kirmizi password seviyesi gorunmuyor",us03.ilkpasswordseviyesi.isDisplayed());
    Driver.wait(2);
}
@And("TCiki Kullanici yedi karakter iki kombinasyon {string} girer Kullanici sifre tablosu renginin ikinci seviye oldugunu dogrular.")
public void kullaniciYediKarakterIkiKombinasyonGirerKullaniciSifreTablosuRengininIkinciSeviyeOldugunuDogrular(String passwordiki) {
    us03.sayfayiAyarla();
    us03.newPasswordBox.sendKeys(passwordiki);
    Assert.assertTrue("ikinci kirmizi password seviyesi gorunmuyor",us03.ikincipasswordseviyesi.isDisplayed());
    us03.newPasswordBox.clear();
    Driver.wait(2);
}


@And("TCuc Kullanici uc kombinasyonlu yedi karakterli {string} girer Kullanici sifre tablosu renginin uc oldugunu dogrular.")
public void tcucKullaniciUcKombinasyonluYediKarakterliGirerKullaniciSifreTablosuRengininUcOldugunuDogrular(String passworduc) {
    us03.sayfayiAyarla();
    us03.newPasswordBox.sendKeys(passworduc);
    Assert.assertTrue("ucuncu kirmizi password seviyesi gorunmuyor",us03.ucuncupasswordseviyesi.isDisplayed());
    us03.newPasswordBox.clear();
    Driver.wait(2);
}

@And("TCdort Kullanici dort kombinasyon yedi karakterli {string} girer Kullanici sifre tablosu renginin dort oldugunu dogrular.")
public void tcdortKullaniciDortKombinasyonYediKarakterliGirerKullaniciSifreTablosuRengininDortOldugunuDogrular(String passworddort) {
    us03.sayfayiAyarla();
    us03.newPasswordBox.sendKeys(passworddort);
    Assert.assertTrue("ucuncu kirmizi password seviyesi gorunmuyor",us03.dorduncupasswordseviyesi.isDisplayed());
    us03.newPasswordBox.clear();
    Driver.wait(2);
}

@And("TCbes Kullanici tum kombinasyonlari farkli uzunlukta {string} girer Kullanici tum girislerin uzunlugunu password seviyesini kontrol eder.")
public void tcbesKullaniciTumKombinasyonlariFarkliUzunluktaGirerKullaniciTumGirislerinUzunlugunuPasswordSeviyesiniKontrolEder(String passwordRandom) {
   Driver.wait(2);
   us03.birinciSeviyePasswordKontrolu(passwordRandom);
   us03.ikinciSeviyePasswordKontrolu(passwordRandom);
   us03.ucuncuSeviyePasswordKontrolu(passwordRandom);
   us03.dorduncuseviyePasswordKontrolu(passwordRandom);

    }



}

