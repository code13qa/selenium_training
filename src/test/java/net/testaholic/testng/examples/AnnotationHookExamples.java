package net.testaholic.testng.examples;

import org.testng.annotations.*;

/**
 * Created by User on 1/16/2017.
 */
public class AnnotationHookExamples {

    @BeforeSuite
    public void setupSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void exampleTestCase(){
        System.out.println("I am the test case");
    }

    @Test
    public void exampleTest2Case(){
        System.out.println("I am the test case2");
    }

    @Test
    public void exampleTest3Case(){
        System.out.println("I am the test case3");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }


    @AfterSuite
    public void destroySuite(){
        System.out.println("AfterSuite");
    }
}
