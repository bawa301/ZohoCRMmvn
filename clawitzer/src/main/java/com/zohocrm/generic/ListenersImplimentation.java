package com.zohocrm.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplimentation extends Baseclass implements ITestListener 
{

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) 
	{
		String ran = result.getName();
		TakesScreenshot t = (TakesScreenshot) driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File dcr = new File("./screenshot/"+ran+".png");
		try 
		{
			FileUtils.copyFile(scr, dcr);
		} 
		catch (IOException e) 
		{

		}

	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

	

}
