package com.tha.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.utility.config;

public class Login extends config {
	WebDriver loginDriver;
	
	@BeforeClass
	public void initalization() {
		driverSetting();
		loginDriver=getDriver();
	}
	
	@Test(priority = 1)
	public void emailvalidation() {	
		
		//loginDriver.findElement(By.id("email")).sendKeys("Sumit");
		WebElement emailElement=elementAccessByID("email");
		emailElement.sendKeys("sumit");
		
	}
	
	@Test(priority = 2)
	public void passwordValidation() {
		
		//loginDriver.findElement(By.id("password")).sendKeys("sumit123");
		WebElement passwordElement=elementAccessByID("password");
		passwordElement.sendKeys("sumit123");
			
	}
	
	@Test(priority = 3)
	public void buttonClick() {
		//loginDriver.findElement(By.xpath("//form[@id='form']//button")).click();
		elementAccessByXpath("//form[@id='form']//button").click();
		//step 1 expected result from BRD
		String expectedEmailMsg="Please enter email as kiran@gmail.com.";
		String expectedPasswordMsg="Please enter password 123456u";
		//Step 2 
		// Access element => email error mes element access
		// Access element => Password error mes element access
		WebElement emailMsgElement=elementAccessByID("email_error");
		WebElement passwordMsgElement= elementAccessByID("password_error");
		
		//step 3 
		// read actual message from element
		String actualEmailMsg = emailMsgElement.getText();
		String actualPasswordMsg=passwordMsgElement.getText();
		
		SoftAssert softAssert=new SoftAssert();
		System.out.println("---------------Before-----------------------");
		softAssert.assertEquals(actualEmailMsg, expectedEmailMsg);
		System.out.println("---------------After-----------------------");
		softAssert.assertEquals(actualPasswordMsg, expectedPasswordMsg);		
		
		softAssert.assertAll();
			
		
		
		
	}
	
//	@Test(priority = 4)
//	public void wrongEmailID() {
//		//It is present in BRD document
//		String expectedEmailMsg="Please enter email as kiran@gmail.com";
//		WebElement emailMsgElement=elementAccessByID("email_error");
//		String actualEmailMsg=emailMsgElement.getText();
//		
//		System.out.println("Actual Result "+actualEmailMsg);
//		System.out.println("expected Result "+expectedEmailMsg);
//		
//		Assert.assertEquals(actualEmailMsg, expectedEmailMsg);
//		System.out.println("After the Asssert Equal method");		
//		
//	}
	
//	@Test(priority = 5)
//	public void wrongPassword() {
//		//It is present in BRD document
//	String expectedPasswordMsg="Please enter password 123456";
//	WebElement passwordElementMsg= elementAccessByID("password_error");
//	String actualPasswordMsg=passwordElementMsg.getText();
//	
//	Assert.assertEquals(actualPasswordMsg, expectedPasswordMsg);
//		
//	}
	
	
	
//	@AfterClass
//	public void closeBrowser() {
//		driver.close();
//	}
	
	

}
