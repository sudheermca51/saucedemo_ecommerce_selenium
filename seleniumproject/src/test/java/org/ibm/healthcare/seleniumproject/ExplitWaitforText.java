package org.ibm.healthcare.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplitWaitforText {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		// Create WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// Wait until the text "Hello World!" is present
		boolean result = wait.
		until(ExpectedConditions.
				textToBe(By.xpath("//div[@id='finish']/h4"), "Hello World!"));
		
		if(result) {
			System.out.println("Testcase is passed, Text is present");
		} else {
			System.out.println("testcase is failed, Text is not present");
		}
		
		wait.until(ExpectedConditions.titleContains("The Internet"));
		
		
	}
}
