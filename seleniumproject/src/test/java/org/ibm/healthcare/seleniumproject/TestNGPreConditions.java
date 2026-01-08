package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPreConditions extends BaseClass {

	WebDriver driver ;
	
 
	@BeforeMethod 
	public void login() {
		
		System.out.println("Login successful");
	}


	@AfterMethod 
	public void logout() {
		System.out.println("Logout successful");
	}

	@Test 
	public void testCase1() {
		
		System.out.println("Test Case 1 executed");
	}


	@Test 
	public void testCase2() {
		
		System.out.println("Test Case 2 executed");
	}
	 

}
