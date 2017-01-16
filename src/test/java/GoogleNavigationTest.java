import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 1/14/2017.
 */
public class GoogleNavigationTest {


    @Test
    public void navigateToGoogleChromeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
        driver.quit();
    }

    @Test
    public void navigateToGoogleFireFoxTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
        driver.quit();
    }



    @Test
    public void navigateToGoogleIETest() {
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
        driver.quit();
    }


    @Test
    public void navigateToGoogleEdgeTest() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
        driver.quit();
    }
}
