package com.epam.lab.report;

import com.epam.lab.loggers.Log;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.infoLog(iTestResult.getInstanceName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.infoLog("success "+iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.infoLog("failed "+iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.infoLog("skipped "+iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.infoLog("test failed but success percentage"+iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.infoLog(iTestContext.toString());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.infoLog(iTestContext.toString());
    }
}
