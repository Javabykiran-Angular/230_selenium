package com.tha.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
	
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement elementAccessByID(String id) {
		return (driver.findElement(By.id(id)));
	}
	
	public WebElement elementAccessByXpath(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	
	
	
	
	
	

}
