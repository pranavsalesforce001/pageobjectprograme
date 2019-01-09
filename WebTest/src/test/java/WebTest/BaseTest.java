package WebTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    @BeforeTest
    public void openbrowser() {

        // set driver path
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\Broweserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        // 5 second impicity wait
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        // browser open on full screen
        driver.manage().window().maximize();
        // open url
        driver.get("https://demo.nopcommerce.com");
    }

    // @AfterTest
    public void closebroser() {
        driver.quit();
    }



}
