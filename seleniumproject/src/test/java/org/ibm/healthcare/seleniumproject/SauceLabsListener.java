package org.ibm.healthcare.seleniumproject;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class SauceLabsListener extends BaseClass implements ITestListener 
{
	private int m_count = 20;

	@Override
	public void onTestFailure(ITestResult tr) {
		log("F");
		try {
			System.out.println("The title of the page is: " + driver.getTitle());
			ScreenshotUtil.captureScreenshot(driver, tr.getName(),m_count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		log("S");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		log(".");
	}

	private void log(String string) {
		System.out.print(string);
		if (++m_count % 40 == 0) {
			System.out.println(" ");
		}
	}
}

