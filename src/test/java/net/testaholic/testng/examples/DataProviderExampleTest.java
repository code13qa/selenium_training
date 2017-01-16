package net.testaholic.testng.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by User on 1/16/2017.
 */
public class DataProviderExampleTest {

    @DataProvider
    public Object[][]  getData(){
        return new Object[][]{{new FirefoxDriver(), "http://google.com"}, {new ChromeDriver(), "http://yahoo.com"}};
    }

    @Test(dataProvider = "getData")
    public void dataProviderTestExample(WebDriver driver, String url){
       driver.get(url);
    }
}
