package org.ibm.healthcare.seleniumproject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {
	public static void main(String[] args) throws IOException {

		//		ChromeDriver driver = new ChromeDriver();
		//		driver.get("https://www.selenium.dev/");
		//		driver.getScreenshotAs(null);


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println("The tile of the page is: " + driver.getTitle());
		
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('Hello from Selenium JavaScript Executor');");
		Alert alert = driver.switchTo().alert();
		alert.accept();

		jse.executeScript("document.body.style.border='5px solid red'");
		jse.executeScript("window.scrollBy(0,5000)");
		jse.executeScript("window.scrollBy(0,-5000)");
		Object obj =jse.executeScript("return document.title;");
		String title = (String) obj;
		System.out.println("Title using JS Executor: "+title);

		jse.executeScript("return document.domain;");
		jse.executeScript("return document.URL;");

		obj=jse.executeScript("return document.getElementById('user-name');");
		WebElement element = (WebElement) obj;
		element.sendKeys("standard_user");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
		
		List<WebElement> list=(List<WebElement>) obj;






	}
}
