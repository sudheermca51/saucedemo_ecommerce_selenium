package org.ibm.healthcare.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffGainers {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");

		String stockName[] = new String[3];

		stockName[0] = "MAC Hotels";
		stockName[1] = "xyz";
		stockName[2] = "ABB India";


//
//		for(int i=0;i<stockName.length;i++) {
//			try 
//			{
//				String currentPrice = driver.findElement(By.xpath("//a[text()='"+stockName[i] +"']/parent::td/following-sibling::td[2]")).getText();
//				System.out.println("Stock details of "+stockName[i]+"-----" + currentPrice);
//			}
//			catch(NoSuchElementException e) {
//				System.out.println("Stock details of "+stockName[i]+"-----" + "Not Found");
//			}
//
//		}

		System.out.println("Group--------Prev Close (Rs)----Current Price (Rs)---% Change---Trade on Dhan");
		for(int i=0;i<stockName.length;i++) {
			try 
			{
				List<WebElement> stockWEList = driver.findElements(By.xpath("//a[text()='"+stockName[i] +"']/parent::td/following-sibling::td"));
				

				for(int j=0;j<stockWEList.size();j++) 
				{
					System.out.print( "Stock details of "+stockName[i]+"-----" + stockWEList.get(j).getText());
				}
				 
				 
			}
			catch(NoSuchElementException e) {
				System.out.println(e.getMessage());
				System.out.println("Stock details of "+stockName[i]+"-----" + "Not Found");
			}

		}





	}
}
