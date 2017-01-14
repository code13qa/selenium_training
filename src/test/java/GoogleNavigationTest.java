import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 1/14/2017.
 */
public class GoogleNavigationTest {


    @Test
    public void navigateToGoogleTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\selenium_training\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
        driver.quit();
    }
}
