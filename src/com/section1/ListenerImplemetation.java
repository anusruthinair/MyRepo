package com.section1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplemetation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver
	}
	

}
