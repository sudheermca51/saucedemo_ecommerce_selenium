package org.ibm.healthcare.seleniumproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsEx {
	
	@Test
	public void login()	{
		System.out.println("Login Successful");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = {"login"},alwaysRun = true)
	public void searchPatient()	{
		System.out.println("Patient Found");
	}
	@Test(dependsOnMethods = {"searchPatient"})
	public void bookAppointment()	{
		System.out.println("Appointment Booked Successfully");
	}
	
	@Test(dependsOnMethods = {"bookAppointment"})
	public void logout()	{
		System.out.println("Logout Successful");
	}
}
