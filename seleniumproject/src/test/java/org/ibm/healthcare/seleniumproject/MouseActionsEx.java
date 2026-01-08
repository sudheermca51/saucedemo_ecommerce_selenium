package org.ibm.healthcare.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionsEx {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		WebElement smallBox= driver.findElement(By.id("draggable"));
		WebElement bigBox= driver.findElement(By.id("droppable"));
		
		
		
		Actions action= new Actions(driver);
		action.clickAndHold(smallBox);
		action.pause(1000);
		action.moveToElement(bigBox);
		action.pause(1000);
		action.release(smallBox);
		action.pause(1000);
		action.perform();//important line to execute all actions
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("drop-status"), "dropped"));
		
		String result = driver.findElement(By.id("drop-status")).getText();
		System.out.println("Result after drag and drop: " + result);
		
		action.doubleClick(driver.findElement(By.id("clickable"))).pause(2000).perform();
		
		WebElement hyperLink = driver.findElement(By.linkText("Click for Results Page"));
		action.moveToElement(hyperLink).click().perform();
		
		
		
	}

}
