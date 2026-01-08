package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateOpenMRSApps {
	

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		
		driver.manage().window().maximize();
		
		boolean result = driver.findElement(By.id("username")).isDisplayed();
		System.out.println("The username field is displayed: " + result);
		
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Admin");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		
		//Click on Inpatient ward
	 
		driver.findElement(By.id("Inpatient Ward")).click();
		
		
		//Click on login button
	 
		driver.findElement(By.id("loginButton")).click();
	 
		try {
			result = driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).isDisplayed();
			 System.out.println("Find A Patient Record Link is Displayed - PASS");
		} catch (NoSuchElementException e) {
			
			System.out.println("Find A Patient Record link is not displayed - FAIL");
		}
		 
		 
		
		
		//include below logic in try catch block
		try {
			result = driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).isDisplayed();
			 System.out.println("Register A Patient Link is Displayed - PASS");
		} catch (NoSuchElementException e) {
			
			System.out.println("Register A Patient link is not displayed - FAIL");
		}
		 
		
		
	}

}
