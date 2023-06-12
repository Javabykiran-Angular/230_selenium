package com.tha.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		driver.get(url);
		
	}
	
	public void waitinSelenium() {
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame("webform");
		
		System.out.println("Before WebDriver Wait=>>>");
		
		WebDriverWait elementwait=new WebDriverWait(driver, 10);
		
		WebElement waitWebelement=elementwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")));
		waitWebelement.sendKeys("Abc@gmail.com");
		System.out.println("After WebDriver Wait=>>>");
		
		//driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")).sendKeys("sumit@gmail.com");
		
	}

}
