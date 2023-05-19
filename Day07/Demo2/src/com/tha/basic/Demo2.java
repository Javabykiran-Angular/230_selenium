package com.tha.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
		String title= driver.getTitle();
		System.out.println("====>> "+title);
		
		String pageSource= driver.getPageSource();
		System.out.println("===> "+pageSource);
		
		String currUlr=driver.getCurrentUrl();
		System.out.println("===> "+currUlr);
		
		

	}

}
