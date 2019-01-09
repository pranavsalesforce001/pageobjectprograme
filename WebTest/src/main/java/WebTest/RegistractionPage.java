//package WebTest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class RegistractionPage extends Utils {
//
//    public void user_should_able_to_register_successfully() {
//        //Register page open
//        clickelement(("ico-register"));
//        // select gender button
//        clickelement(By.id("gender-male"));
//        // Add First Name
//        enterText(By.id("FirstName"), "Pranav");
//        System.out.println("Firstname Pranav  will appear");
//        // Add Last Name
//        enterText(By.id("LastName"), "Mehta");
//        System.out.println("LastName Mehta will appear");
//        //select the dob box
//        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
//        day.selectByIndex(1);
//        System.out.println("User is able to see Day Box");
//        // select the month box
//        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//        month.selectByVisibleText("January");
//        System.out.println("User is able to see month Box");
//        // select the year box
//        Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
//        Year.selectByValue("1990");
//        // Create Object for date
//        DateFormat date = new SimpleDateFormat("MMddyyyyHHmmss");
//        Date date1 = new Date();
//        String date2 = date.format(date1);
//        //Every time change email address by adding date and time
//        enterText(By.id("Email"), "Pranav190" + date2 + "@gmail.com");
//        System.out.println("user should login with this email id");
//        //Enter company name
//        enterText(By.id("Company"), "GS IT Hub Ltd");
//        System.out.println("use should see company name");
//        // newsletter button box
//        enterText(By.id("Newsletter"), "Ture");
//        System.out.println("User could see newsletter button box");
//        // user should enter the password
//        enterText(By.id("Password"), "Abc123");
//        System.out.println("User is able to enter the password");
//        //user should enter the confirm password
//        enterText(By.id("ConfirmPassword"), "Abc123");
//        System.out.println("User is able to enter the password in the confirm box");
//        clickelement(By.id("register-button"));
//        //user is able to click on register button
//        String actualRegisterSuccessMessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
//        //user should get successfully register message
//        Assert.assertEquals("Your registration completed", expectedRegisterSuccessMessage, actualRegisterSuccessMessage);
//        //user should click on continue  button
//        clickelement(By.xpath("//input[@name=\"register-continue\"]"));
//        System.out.println(" User is able to see next page");
//
//    }
//
//
//
//
//}
