package org.ibm.healthcare.seleniumproject;

import org.testng.annotations.Test;

public class GroupingEx {

	
	@Test(groups = {"regression","sanity"})
	public void sample() {
		
	}
	@Test(groups = {"regression","ui"})
	public void sample1() {
		
	}
	@Test(groups = {"regression","api"})
	public void sample2() {
		
	}
	
	@Test(dependsOnGroups = {"api","ui"})
	public void sample3() {
		
	}
}
