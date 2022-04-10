package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_012Page {

    @FindBy(xpath = "//span[contains(text(),'US08 ADMİN')]")
    public WebElement us08AdminWebElement;

    @FindBy(xpath = "//span[normalize-space()='Password']")
    public WebElement passwordButton;



    @FindBy(xpath="//span[normalize-space()='MY PAGES']")
    public WebElement myPage;



    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;
    public WebElement singInWebElement;


    public void scrollToWebelementVisible(WebElement webElement){
        JavascriptExecutor jss= (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);",webElement);
    }


    }



