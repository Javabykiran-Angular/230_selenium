package com.tha.testng;

import org.testng.annotations.Test;

public class Demotestng {

	@Test(priority = 1)
	public void aTest() {
		System.out.println("--- aTest execute----");
	}
	
	@Test(priority = 2)
	public void lTest() {
		System.out.println("----- lTest execute------");
	}
	
	
	@Test(priority = 3)
	public void bTest() {
		System.out.println("----- bTest execute------");
	}
	
	
	
	
}
