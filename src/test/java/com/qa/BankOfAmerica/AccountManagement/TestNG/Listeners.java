package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
	
		
	}

	public void onStart(ITestContext arg0) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This Test Case is failed: "+result.getName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This test case is skipped: "+result.getName());
		
		
	}

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test case is passed: "+result.getName());
		
	}

}
