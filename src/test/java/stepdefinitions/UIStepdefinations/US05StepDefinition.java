package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US05_Pages;
import utilities.Driver;

public class US05StepDefinition {

static US05_Pages us05=new US05_Pages();
static Actions actions=new Actions(Driver.getDriver());
@Then("kullanici Make An Appointment butonuna tiklar.")
public void kullaniciMakeAnAppointmentButonunaTiklar() {
Assert.assertTrue("makeAnAppointment gorunmuyor",us05.makeAnAppointment.isDisplayed());
us05.makeAnAppointment.click();
Assert.assertTrue("makeAnAppointment tiklanamadi",us05.appointmentDateTimeText.isDisplayed());
}
@Then("kullanici First Name box tiklar.")
public void kullaniciFirstNameBoxTiklar() {
Assert.assertTrue(us05.firstNameBox.isEnabled());
us05.firstNameBox.click();

}

@And("kullaici {string}  girer.")
public void kullaiciGirer(String firstName) {
us05.firsNameData(firstName);
String actualData=us05.firstNameBox.getAttribute("value");
Assert.assertEquals(firstName,actualData);

}


}
