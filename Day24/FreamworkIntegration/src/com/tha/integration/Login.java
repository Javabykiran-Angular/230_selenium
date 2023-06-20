package com.tha.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	}
	
//	@AfterClass
//	public void closeBrowser() {
//		driver.close();
//	}
	
	

}
