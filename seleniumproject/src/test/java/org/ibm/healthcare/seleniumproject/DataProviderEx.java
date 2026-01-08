package org.ibm.healthcare.seleniumproject;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@DataProvider(name = "test1")
	public Object[][] createData1() {
		return new Object[][] 
		{
			{ "Cedric", 36 },
			{ "Anne", 37},
			{ "Anne", 37},
		};
	}

	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test2")
	public void verifyData1(String n1, String n2) {
		System.out.println(n1 + " " + n2);
	}
	
	@DataProvider(name = "test2")
	public String[][] feedData() throws IOException {
	 
		return ExcelUtils.readXLSX();
	}

}
