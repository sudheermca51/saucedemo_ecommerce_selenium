package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	protected WebDriver driver ;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Setup successful");
		//create a driver instance
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		System.out.println("Teardown successful");
	 
	}
	@BeforeTest
	public void beforeTest() {
		//read a property file
		System.out.println("Before Test executed");
	}
	@BeforeSuite
	public void beforeSuite() {
		//connect to DB
		System.out.println("Before Suite executed");
	}
	@AfterSuite
	public void afterSuite() {
		//connect to DB
		System.out.println("Before Suite executed");
	}
	@AfterTest
	public void afterTest() {
		//close the property file
		System.out.println("After Test executed");
		//close the driver instance
		driver.close();
	}
	@BeforeGroups(groups = {"regression"})
	public void beforeGroup() {
		//close the property file
		System.out.println("After Test executed");
	}
	@AfterGroups(groups = {"regression"})
	public void afterGroup() {
		//close the property file
		System.out.println("After Test executed");
	}
}
