package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils {

    By objproductclick = By.xpath("//div[@class=\"page-body\"]/div[4]/div[2]/div[2]/div/div/a[@href=\"/apple-macbook-pro-13-inch\"]");

    public void productclick() {

        clickeliment(objproductclick);
    }

    By objfriendemailid = By.xpath("//div[@class=\"email-a-friend\"]");
    public void friendemail(){
    enterText(objfriendemailid,"pranav151"+timestamp() +"@gmail.com");
    }
    By objPersonalmessage = By.id("Personal Message");
    public void personalmessage(){
        enterText(objPersonalmessage,"add it.");
    }
    By objproductpage = By.name("send-email");
    public void sendemail(){
        clickeliment(objproductpage);}


        public void messagesentsuccessfully(){
            String actualresult = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
            // user sent message successfully
            String expected="Your message has been sent.";
            Assert.assertEquals("Your message has been sent.", expected, actualresult);
    }
      By objlogout =By.xpath("//a[@class=\\\"ico-logout\\\"]");
       public void logout(){
           clickeliment(objlogout);


       }

    }



