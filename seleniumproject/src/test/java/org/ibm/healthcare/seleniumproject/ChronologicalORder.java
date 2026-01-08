package org.ibm.healthcare.seleniumproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChronologicalORder {

	 
	@Test	(priority=-3,description="This is test B method",timeOut=5000)
	public void testB() {
		System.out.println("Test B executed");
		
		int i = 1/0;
		
		
	}
	 
	@Test(priority=1)
	public void testD() {
		System.out.println("Test D executed");
	}
	@Test(priority=2)	
	public void testC() {
		System.out.println("Test C executed");
	}
	@Test(priority=0)
	public void testA() {
		System.out.println("Test A executed");
	}
}
