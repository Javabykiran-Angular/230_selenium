package com.tha.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		//linkText locator
		//driver.findElement(By.linkText("Register a new membership")).click();
		
		//partialLinkText locator
		driver.findElement(By.partialLinkText("Register a")).click();
		//name locator
		driver.findElement(By.name("name")).sendKeys("Sumit");
		//Id locator
		driver.findElement(By.id("mobile")).sendKeys("7972547618");
		//Tag name locator
		
		//driver.findElement(By.tagName("input")).sendKeys("sumit@gmail.com"); //it fails
		
		List<WebElement> listElement= driver.findElements(By.tagName("input"));
		System.out.println(listElement.size());
		
		for(int i=0;i<listElement.size();i++) {
			
			String strplaceholder=listElement.get(i).getAttribute("placeholder");
			
			System.out.println("=> "+strplaceholder);
			
			if(strplaceholder.compareTo("Email")==0) {
				System.out.println("---element found----");
				
				listElement.get(i).sendKeys("abc@gmail.com");
				
			}
			
//			if(listElement.get(i).getAttribute("placeholder").compareTo("Email")==0) {
//				System.out.println("element found");
//			}
			
			
		}
		
		
		

	}

}
