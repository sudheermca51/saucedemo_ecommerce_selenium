package org.ibm.healthcare.seleniumproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	
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
		
		//get the parent window handle
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window Handle: "+parentWindow);
		
		Set<String> wSet=driver.getWindowHandles();
		System.out.println("Size of the window set: "+wSet.size());
		
		for(String winHandle : wSet) 
		{
			System.out.println("Window Handle: "+winHandle);
			//Switch to the window represented by winHandle
			driver.switchTo().window(winHandle);
			
			//Check if the window is the desired one by checking the title
			
			if(driver.getTitle().contains("TATA CONSULTANCY SERVICES LTD")) 
			{
				String price = driver.findElement(By.xpath("//h1[contains(text(),'Tata')]/following-sibling::table//span[@id='ltpid']")).getText();
				System.out.println("TCS Price: "+price);
				break;
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title: "+driver.getTitle());
		
		
	}

}
