package WebTest;

import com.sun.org.omg.CORBA.AttrDescriptionSeqHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.rmi.CORBA.Util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Utils {
    WebDriver driver;
    String expectedRegisterSuccessMessage = "Your registration completed";

    By objregister = By.className("ico-register");

    public void register() {
        clickeliment(objregister);
    }

    By objgender = By.id("gender-male");

    public void gender() {
        clickeliment(objgender);
    }

    By objFirstName = By.id("FirstName");

    public void FirstName() {
        enterText(objFirstName, "Pranav");
    }

    By objLastName = By.id("LastName");

    public void LastName() {
        enterText(objLastName, "Mehta");
    }

    By objSelectDay = By.name("DateOfBirthDay");

    public void selectBirhDay() {
        selectByIndex(objSelectDay, 1);
    }

    By objSelectMonth = By.name("DateOfBirthMonth");

    public void selectMonth() {

        selectByVisibleText(objSelectMonth, "January");
    }

    By objSelectYear = By.name("DateOfBirthYear");

    public void setObjSelectYear() {
        selectbyvalue(objSelectYear, "1990");
    }

    private AttrDescriptionSeqHelper by;
    By objselectemail = By.id("Email");

    public void emailaddress() {
        enterText(objselectemail, "Pranav160"+timestamp() +"@gmail.com");
    }

    By objcompanyname = By.id("Company");

    public void CompanyName() {
        enterText(objcompanyname, "GS It Hub Ltd");
    }

    By objnewsletter = By.id("Newsletter");

    public void newsletter() {
        enterText(objnewsletter, "True");
    }

    By objpassword = By.id("Password");

    public void password() {
        enterText(objpassword, "Abc123");
    }

    By objconfirmpassword = By.id("ConfirmPassword");

    public void confirmpassword() {
        enterText(objconfirmpassword, "Abc123");
    }

    By objregisterbutton = By.id("register-button");

public void registerbutton() {     clickeliment(objregisterbutton); }
    By objcontinue = By.xpath("//input[@name='register-continue']");

    public void continuebutton(){clickeliment(objcontinue);}

    public void verifyRegistrationSuccessfulMessage() {
        String actualRegisterSuccessMessage = driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"")).getText();
        //user should get successfully register message
        Assert.assertEquals("Your registration completed", expectedRegisterSuccessMessage, actualRegisterSuccessMessage);




    }
}


