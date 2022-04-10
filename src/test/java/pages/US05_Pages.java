package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US05_Pages {

    public  US05_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy (xpath = "//*[contains(@class,'d-none d-md-inline')]")
public WebElement makeAnAppointment;
@FindBy (xpath = "//*[contains(text(),'Appointment DateTime')]")
public WebElement appointmentDateTimeText;
@FindBy (css = "input[id=firstName]")
public WebElement firstNameBox;

public void firsNameData(String firstnameData){
firstNameBox.sendKeys(firstnameData);


}






}
