package com.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.base.Base;
import com.commonactions.Commonactions;


public class ListenerClass extends ExtentManager implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 
	 * Commonactions action = new Commonactions();
	 * 
	 * public void onTestStart(ITestResult result) { test =
	 * extent.createTest(result.getName()); }
	 * 
	 * public void onTestSuccess(ITestResult result) { if (result.getStatus() ==
	 * ITestResult.SUCCESS) { test.log(Status.PASS, "Pass Test case is: " +
	 * result.getName()); } }
	 * 
	 * public void onTestFailure(ITestResult result) { if (result.getStatus() ==
	 * ITestResult.FAILURE) { try {
	 * 
	 * test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +
	 * " - Test Case Failed", ExtentColor.RED)); test.log(Status.FAIL,
	 * MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed",
	 * ExtentColor.RED)); String imgPath = action.screenShot(Base.getDriver(),
	 * result.getName());
	 * 
	 * test.fail("ScreenShot is Attached",
	 * MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
	 * 
	 * 
	 * System.out.println("Test case is failed");
	 * test.fail("Test case is failed for this test");
	 * 
	 * 
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 * 
	 * public void onTestSkipped(ITestResult result) { if (result.getStatus() ==
	 * ITestResult.SKIP) { test.log(Status.SKIP, "Skipped Test case is: " +
	 * result.getName()); } }
	 * 
	 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //
	 * TODO Auto-generated method stub }
	 * 
	 * public void onStart(ITestContext context) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * public void onFinish(ITestContext context) { // TODO Auto-generated method
	 * stub }
	 */}
