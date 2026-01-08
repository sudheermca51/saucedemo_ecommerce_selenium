package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistierRediff {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		String actual = driver.findElement(By.xpath("//label[normalize-space()='Full Name']")).getText();
		
		String expected = "Full Name";
		
		System.out.println(actual.equals(expected) ? "Test Passed" : "Test Failed");
		
		
		driver.findElement(By.xpath("//*[@placeholder='Enter your full name']")).sendKeys("Selenium");


		driver.findElement(By.xpath("//*[@placeholder='Enter Rediffmail ID']")).sendKeys("ABC");
		driver.findElement(By.id("newpasswd")).sendKeys("Hello") ;
		driver.findElement(By.id("newpasswd1")).sendKeys("Hello");


		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		Select countrySelect = new Select(driver.findElement(By.id("country")));
		
		countrySelect.selectByVisibleText("American Samoa");
		
		
		//Enter username
		
	}
}
