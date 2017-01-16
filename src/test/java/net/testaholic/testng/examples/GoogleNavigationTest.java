package net.testaholic.testng.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by User on 1/14/2017.
 */
public class GoogleNavigationTest {

    private WebDriver driver;

    @Test
    public void navigateToGoogleChromeTest() {
        driver = new ChromeDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
    }

    @Test
    public void navigateToGoogleFireFoxTest() {
        driver = new FirefoxDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
    }



    @Test
    public void navigateToGoogleIETest() {
        driver = new InternetExplorerDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
    }


    @Test
    public void navigateToGoogleEdgeTest() {
        driver = new EdgeDriver();
        driver.get("http://google.com");

        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
    }

    @AfterMethod
    public void killDriver(){
        driver.quit();
    }
}
