package org.ibm.healthcare.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		action.keyDown(Keys.SHIFT);
		action.sendKeys(driver.findElement(By.id("clickable")),"Hello World");
		action.keyUp(Keys.SHIFT);
		action.perform();
		
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.pause(2000);
		action.sendKeys("cvv");
		action.keyUp(Keys.CONTROL);
		action.sendKeys("a");
		action.perform();
		
		
		
		
//		//Cut and copy the text operations
//        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
//
//        
//		action.sendKeys(Keys.ARROW_LEFT);
//		action.keyDown(Keys.SHIFT);
//		action.sendKeys(Keys.ARROW_UP);
//		action.pause(3000);
//		action.keyUp(Keys.SHIFT);
//		action.pause(3000);
//		action.keyDown(cmdCtrl);
//		action.sendKeys("xvv");
//		action.keyUp(cmdCtrl);
//		action.perform();
		
		
		
	}
}
