package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver( );
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//switch to frame by id or name
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS");
		driver.findElement(By.className("getqbtn")).click();
		
		//Switch back to main page
		driver.switchTo().defaultContent();
		
		
		
		driver.findElement(By.linkText("Rediffmail")).click();
	 
		
		
		
	}

}
