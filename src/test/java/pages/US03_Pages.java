package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_Pages {
    Actions actions = new Actions(Driver.getDriver());

    public US03_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerElement;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPasswordBox;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement ilkpasswordseviyesi;
    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement ikincipasswordseviyesi;
    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement ucuncupasswordseviyesi;
    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement dorduncupasswordseviyesi;

    public void newPasswordBoxGo() {
        registerElement.click();
        Driver.wait(2);
    }

    public void sayfayiAyarla() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    public void birinciSeviyePasswordKontrolu(String passwordbir) {
        sayfayiAyarla();
        newPasswordBox.sendKeys(passwordbir);
        if (passwordbir.length() == 4 && ilkpasswordseviyesi.isDisplayed()) {
            Assert.assertTrue("Ilk seviye password seviyesi gorunmuyor", ilkpasswordseviyesi.isDisplayed());
            Driver.wait(3);
            System.out.println("Dort Karakterli password girildi ve birinci seviye password seviyesi goruldu");
        }
        newPasswordBox.clear();
    }

    public void ikinciSeviyePasswordKontrolu(String passwordiki) {
        sayfayiAyarla();
        newPasswordBox.sendKeys(passwordiki);
        if (passwordiki.length() == 7 && ikincipasswordseviyesi.isDisplayed()) {
            Assert.assertTrue("Ikinci seviye password seviyesi gorunmuyor", ikincipasswordseviyesi.isDisplayed());
            Driver.wait(3);
            System.out.println("Yedi Karakterli password girildi ve ikinci seviye password seviyesi goruldu");
        }
        newPasswordBox.clear();
    }

    public void ucuncuSeviyePasswordKontrolu(String passworduc) {
        Driver.wait(3);
        sayfayiAyarla();
        newPasswordBox.sendKeys(passworduc);
        if (passworduc.length() == 7 && ucuncupasswordseviyesi.isDisplayed()) {
            Assert.assertTrue("Ucuncu  seviye password seviyesi gorunmuyor", ucuncupasswordseviyesi.isDisplayed());
            Driver.wait(3);
            System.out.println("Yedi Karakterli password girildi ve ucuncu seviye password seviyesi goruldu");
        }
        newPasswordBox.clear();
    }

    public void dorduncuseviyePasswordKontrolu(String passworddort) {
        Driver.wait(3);
        sayfayiAyarla();
        newPasswordBox.sendKeys(passworddort);
        if (passworddort.length() == 7 && dorduncupasswordseviyesi.isDisplayed()) {
            Assert.assertTrue("Dorduncu seviye password seviyesi gorunmuyor", dorduncupasswordseviyesi.isDisplayed());
            System.out.println("Yedi Karakterli password girildi ve dorduncu seviye password seviyesi goruldu");
        }
        newPasswordBox.clear();
    }
}