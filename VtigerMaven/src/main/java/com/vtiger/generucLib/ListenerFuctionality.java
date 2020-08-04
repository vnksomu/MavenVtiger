package com.vtiger.generucLib;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerFuctionality implements ITestListener{

	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String tcName=result.getMethod().getMethodName();
		EventFiringWebDriver efwd= new EventFiringWebDriver(BaseClass.driver);
		File sourceFile=efwd.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("./screeshot/"+tcName+".png");
		try 
		{
			FileUtils.copyFile(sourceFile,destinationFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
