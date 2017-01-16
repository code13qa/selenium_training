package net.testaholic.testng.examples;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by User on 1/15/2017.
 */
public class TestAnnotationExampleTest {

    @Test(priority = 0, groups = {"SMOKE"})
    public void simpleFirstTest(){
        System.out.println("Im the first test");

    }

    @Test(priority = 1, groups = {"SMOKE", "MOBILE"})
    public void simpleSecondTest(){
        System.out.println("Im the second test");

    }

    @Test(priority = 2, groups = {"REGRESSION"})
    public void simpleThirdTest(Method method){
        System.out.println(method.getName());
        System.out.println("Im the third test");
    }

    @Test(priority = 3,  groups = {"REGRESSION"})
    public void simpleFourthTest(){
        System.out.println("Im the fourth test");
    }
}
