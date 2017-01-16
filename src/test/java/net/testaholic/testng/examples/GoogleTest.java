package net.testaholic.testng.examples;

import net.testaholic.tests.BaseTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * Created by User on 1/16/2017.
 */
public class GoogleTest extends BaseTest {


    @Test
    public void navigateToGoogle(){
       driver.get("http://google.com");
    }

    @Test
    public void failTest(){
        Assert.fail("I failed this test case.");
    }

    @Test
    public void skipTestCase(){
        throw new SkipException("I skipped this test case");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void expectedExceptionTest(){
        throw new NullPointerException("NPE Expected Test");
    }

    @Test
    public void nonExpectedExceptionTest(){
        throw new NullPointerException("NPE Non Expected Test");
    }

}
