package org.ibm.healthcare.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitforWEBox {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("adder")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement redbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='redbox']")));
		System.out.println(redbox.isDisplayed());
		
		//static property
		String actualColor = redbox.getCssValue("background-color");
	    System.out.println(actualColor);
	    
	    String expectedColor = "rgba(255, 0, 0, 1)";
	    
	    if(actualColor.equals(expectedColor)) {
	    	System.out.println("Testcase is passed, Redbox is displayed with correct color");
	    } else {
	    	System.out.println("Testcase is failed, Redbox color is incorrect");
	    }
	    
	}

}
