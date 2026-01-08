package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineWebApplicationTests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/h2k/2025/OnlineRegistration.html");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("gender")).click();
		
		driver.findElement(By.name("gender")).click();
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		
		String actual = driver.findElement(By.xpath("//label[normalize-space()='First name:']")).getText();
		
		String expected = "First name:";
		
		System.out.println(actual.equals(expected) ? "Test Passed" : "Test Failed");
		
		
//		
//		WebElement checkbox= 	driver.findElement(By.name("newsletter"));
//		checkbox.click();
//		checkbox.click();
//		
//		driver.findElement(By.className("information")).clear();
//		
//		driver.findElement(By.className("information")).sendKeys("John Doe");
//		
//		WebElement fnameWE = driver.findElement(By.className("information"));
//		fnameWE.clear();
//		fnameWE.sendKeys("Jane Smith");
//		
//		boolean result = fnameWE.isEnabled();
//		System.out.println("Is the text field enabled? " + result);
//		
//		String text = fnameWE.getAttribute("value");
//		System.out.println("The text entered in the field is: " + text);
//		
//		Dimension size = fnameWE.getSize();
//		System.out.println("Width: " + size.getWidth() + ", Height: " + size.getHeight());
//		
//		
//		//ID Selector in CSS
//		fnameWE = driver.findElement(By.cssSelector("#fname"));
//		fnameWE.clear();
//		fnameWE.sendKeys("Css Selector Name");
//		
//		//ID Selector 
//		WebElement lNameWE = driver.findElement(By.id("lname"));
//		lNameWE.clear();
//		lNameWE.sendKeys("ID Selector Last Name");
//		
//	    checkbox= 	driver.findElement(By.name("newsletter"));
//		checkbox.click();
//		
//		WebElement link= driver.findElement(By.linkText("Selenium Official Page"));
//		link.click();
//		
//		
//		link= driver.findElement(By.partialLinkText("Official Page"));
//		link.click();
//		
//		WebElement hlinkWE = driver.findElement(By.tagName("a"));
//		hlinkWE.click();
//		
//		WebElement radioFButton = driver.findElement(By.xpath("//input[@value='f']"));
//		radioFButton.click();
		
				
	}
}
