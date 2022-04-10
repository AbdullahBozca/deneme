package stepdefinitions.UIStepdefinations;

import io.cucumber.java.en.And;
import pages.US08Page;
import pages.US_012Page;

public class US_012StepDefinitions {

    US_012Page us012Page = new US_012Page();

    @And("My Page menusune tiklar")
    public void myPageMenusuneTiklar() {
        us012Page.myPage.click();

    }

    @And("My appointements butonuna tiklar")
    public void myAppointementsButonunaTiklar() {
        us012Page.myAppointments.click();

    }

    @And("Hastasını secip Edit butonuna tiklar")
    public void hastasınıSecipEditButonunaTiklar() {

    }

    @And("Request a test butununa tiklar")
    public void requestATestButununaTiklar() {
    }

}