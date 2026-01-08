package org.ibm.healthcare.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitforWE {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("reveal")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement revealedWE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
		revealedWE.sendKeys("Selenium WebDriver");
	
		String text = revealedWE.getDomProperty("value");//dynamic value set 
		System.out.println("The entered text is: "+text);
		
	
	}

}
