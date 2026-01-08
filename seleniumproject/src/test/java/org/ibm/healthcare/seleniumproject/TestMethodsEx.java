package org.ibm.healthcare.seleniumproject;

import org.testng.annotations.Test;

public class TestMethodsEx extends BaseClass {
	
	@Test
	public void method1() {
		System.out.println("Method 1 executed");
	}
	@Test(groups = {"regression"})
	public void method2() {
		System.out.println("Method 2 executed");
	}
}