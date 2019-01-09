package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
//   private static final Object By =;

    // Ten Methods
    // Methods should be Static

    //Click Method
    public static void clickeliment(By by) {
        driver.findElement(by).click();
    }

    //Enter Text Method
    public static void enterText(By by, String Value) {
        driver.findElement(by).sendKeys(Value);
    }

    //Get Text Method
    public static void gettext(By by) {
        driver.findElement(by).getText();
    }

    //Time stamp
    public static  String timestamp() {

        SimpleDateFormat date = new SimpleDateFormat("MMddyyyyHHmmss");
        Date date1 = new Date();
        String date2 = date.format(date1);
        return date2;
    }

    // Explicity Method
    public static void ExplicityelementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Implicity Method
    public static void Implicity() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    // GetValuebyAttribute Method
    public static <BeforeTest> void getvalueattribute(By by, String value) {
        String valueAttribute = driver.findElement(by).getAttribute(value);

    }
    //Method select byindex
    public static void selectByIndex(By by,int index) {
        Select se = new Select(driver.findElement(by));
        se.selectByIndex(index);
    }
    // Method select byvisibletext
    public static void selectByVisibleText(By by,String Text){
        Select se = new Select(driver.findElement(by));
        se.selectByVisibleText("January");
    }
    // Method select by value
    public static void selectbyvalue(By by,String Value){
        Select se = new Select(driver.findElement(by));
        se.selectByValue("1990");
    }


}




