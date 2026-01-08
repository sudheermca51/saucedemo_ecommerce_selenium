package org.ibm.healthcare.seleniumproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	 
	@Test
	public void loginTest() {
		System.out.println("Login Test executed");
		Reporter.log("Login Test executed");

	}
	public void login(String username, String password) {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	public void readXLSX() throws IOException
	{
		File f = new File("data.xlsx");
		FileInputStream fis = new FileInputStream(f);	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();//4
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();//2

		String data[][] = new String[rows-1][cols];

		for(int i=0;i<rows;i++){
			{
				for(int j=0;j<cols;j++)
				{
					data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data[i][j] + " | ");
				}

			}

		}
		fis.close();

	}
	@Parameters({"url","user", "pass"})
	@Test
	public void loginTest_TC123(String url, String user, String pass) {


		driver.get(url);

		boolean result = driver.findElement(By.id("username")).isDisplayed();
		System.out.println("The username field is displayed: " + result);

		login(user, pass);

		String actualText = driver.findElement(By.tagName("h4")).getText().trim();

		String expectedText = "Logged in as Super User (admin) at Inpatient Ward.";

		Assert.assertEquals(actualText, expectedText, "Login not successful - Text mismatch");


	}

}
