package com.tha.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	WebDriver driver;
	
	public void SetBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 this.driver=new ChromeDriver();
		
		this.driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
	}
	
	
}
