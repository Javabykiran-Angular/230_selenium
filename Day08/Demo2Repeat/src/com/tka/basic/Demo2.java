package com.tka.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
		String strTitle= driver.getTitle();
		System.out.println("=>> "+strTitle);
		
		String strPageSource=driver.getPageSource();
		System.out.println("--------------------------");
		System.out.println(strPageSource);
		
		String strCurrentUrl= driver.getCurrentUrl();
		System.out.println("--- "+strCurrentUrl);
		
		

	}

}
