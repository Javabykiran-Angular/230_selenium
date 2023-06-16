package com.tha.demo2;

import org.testng.annotations.Test;

public class Signup {
	
	@Test(priority = 1)
	public void signup1() {
		System.out.println("==>signup1 ===>  ");
	}
	
	@Test(priority = 2)
	public void signup12() {
		System.out.println("==>signup12 ===>  ");
	}

}
