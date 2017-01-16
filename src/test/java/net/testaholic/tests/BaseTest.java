package net.testaholic.tests;

import net.testaholic.listeners.ResultListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

/**
 * Created by User on 1/16/2017.
 */

@Listeners({ResultListener.class})
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setupDriver(){
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void killDriver(){
        driver.quit();
    }
}
