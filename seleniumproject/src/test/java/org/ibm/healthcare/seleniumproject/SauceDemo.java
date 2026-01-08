package org.ibm.healthcare.seleniumproject;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemo {
	WebDriver driver;
	public void login()
	{  
		ChromeOptions options = new ChromeOptions();
	    Map<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("credentials_enable_service", false);
		chromePrefs.put("profile.password_manager_enabled", false);
		chromePrefs.put("profile.password_manager_leak_detection", false); // <======== This is the important one
		options.setExperimentalOption("prefs", chromePrefs);
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}
	public void checkOut()
	{
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	}
	public void orderThis(String item)  
	{
		System.out.println("//div[text()='"+item+"']/ancestor::div/following-sibling::div/button");
		driver.findElement(By.xpath("//div[text()='"+item+"']/ancestor::div/following-sibling::div/button")).click();
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
	}

	public String fetchSuccessMessage()
	{
		String msg=driver.findElement(By.className("complete-header")).getText();
		System.out.println("Success Message: "+msg);
		return msg;
	}
	public void logout()
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 		WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));

		// Step 3: Click Logout
 		logoutLink.click();
		System.out.println("✅ Successfully logged out!");
		 
	}
	public static void main(String[] str) {
		SauceDemo sd=new SauceDemo();
		sd.login();
		sd.orderThis("Sauce Labs Bolt T-Shirt");
		sd.checkOut();
		String actualMessage=sd.fetchSuccessMessage();
		sd.logout();
		String expectedMessage="THANK YOU FOR YOUR ORDER";
		if(expectedMessage.equals(actualMessage))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}