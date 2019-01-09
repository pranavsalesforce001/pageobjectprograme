package WebTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {


    @Test
    public void user_should_able_to_register_successfully() {
        RegistrationPage registration = new RegistrationPage();
        registration.register();
        registration.gender();
        registration.FirstName();
        registration.LastName();
        registration.selectBirhDay();
        registration.selectMonth();
        registration.setObjSelectYear();
        registration.emailaddress();
        registration.CompanyName();
        registration.newsletter();
        registration.password();
        registration.confirmpassword();
        registration.registerbutton();
       registration.continuebutton();


    }

    @Test

    public void Registered_user_should_able_to_send_product_to_friend() {
        user_should_able_to_register_successfully();
        ProductPage product = new ProductPage();
        product.productclick();
        product.friendemail();
      //  product.youremailaddress();
        product.personalmessage();
        product.sendemail();

    }



    }



