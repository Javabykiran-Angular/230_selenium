package com.tha.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoOnDataProvider {
	
	@Test(priority = 1,dataProvider = "testdata")
	public void loginTest(int id,String username,String password) {
		System.out.println("Login Test Execute");
		System.out.println("----------------------------");
		System.out.println("Id => "+id);
		System.out.println("Username => "+username);
		
		System.out.println("Password => "+password);
		
		//Assert.assertEquals("abc",username );
		
		
	}
	
	@DataProvider(name = "testdata")
	public Object[][] dataProviderData() {
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","789"},
		};
		
		
	}

}
