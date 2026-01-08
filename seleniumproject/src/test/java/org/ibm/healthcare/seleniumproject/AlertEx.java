package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();// to click on OK button
		
	
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text messages: "+alertText);
		alert.dismiss(); // to click on Cancel button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert.sendKeys("Selenium Alert Test");
		alert.accept();
		
		
		
	}
}
