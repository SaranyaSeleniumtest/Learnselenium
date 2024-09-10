package com.netBanking.utilities;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listners extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed");
	}
	
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}
	
	
	public void onStart(ITestContext testContext) {
		System.out.println("Test started");
	}
	

	public void onFinish(ITestContext testContext) {
		System.out.println("Test Finished");
	}
	

}
