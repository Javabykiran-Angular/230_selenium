package com.tha.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
		WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		emailElement.sendKeys("Sumit@gmail.com");
		
		
		

	}

}
