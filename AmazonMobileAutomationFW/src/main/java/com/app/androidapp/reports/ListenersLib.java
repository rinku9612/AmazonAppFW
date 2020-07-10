package com.app.androidapp.reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.app.android.lib.BaseLib;
import com.app.androidapp.init.Constants;
import com.app.androidapp.util.MobileActionUtil;
import com.aventstack.extentreports.Status;

public class ListenersLib implements ITestListener {
	


	public void onTestStart(ITestResult result) {
		ExtentManager.testlog.log(Status.INFO, result.getName()+" is Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		ExtentManager.testlog.log(Status.PASS, result.getName()+" is Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		ExtentManager.testlog.log(Status.FAIL, result.getName()+" is Fail");
		try {
			MobileActionUtil.capture(BaseLib.gv.driver, result.getName());
			ExtentManager.testlog.addScreenCaptureFromPath(Constants.screenShotPath+result.getName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentManager.testlog.log(Status.FAIL, result.getName()+" is fail");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		ExtentManager.report(context);
		ExtentManager.testlog.log(Status.INFO, context.getName()+"suite is started");	
		
	}

	public void onFinish(ITestContext context) {
		ExtentManager.testlog.log(Status.INFO, context.getName()+" Suite is Completed");
		ExtentManager.report.flush();
	}

}
