package net.testaholic.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by User on 1/16/2017.
 */
public class ResultListener implements ITestListener {


    public void onTestStart(ITestResult result) {
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test was successful");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test was skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
