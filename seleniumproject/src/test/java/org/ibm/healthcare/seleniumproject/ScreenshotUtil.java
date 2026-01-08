package org.ibm.healthcare.seleniumproject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {
 
	public static String captureScreenshot(WebDriver driver, String screenshotName, int m_count) throws IOException {
		
		System.out.println("Value of m_count is: " + m_count);
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd_HH-mm-ss-SSS");
		screenshotName = screenshotName + "_" + sdf.format(now.getTime());
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile.getAbsolutePath());
		File destFile = new File(System.getProperty("user.dir")+"/screenshots/"+screenshotName+".png");
		FileHandler.copy(srcFile, destFile);
		System.out.println("screenshot captured successfully" + destFile.getAbsolutePath());
		return destFile.getAbsolutePath();
	}

}
