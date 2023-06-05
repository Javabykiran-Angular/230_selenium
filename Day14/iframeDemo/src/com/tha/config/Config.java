package com.tha.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		driver.get(url);
		
	}
	
	public void iframeAccess() {
		
//		driver.switchTo().frame(1);
		driver.switchTo().frame("webform");
//		WebElement iframeElement=driver.findElement(By.xpath("//*[@id=\"grwf2_S4ibL_iiicu\"]/iframe"));
//		driver.switchTo().frame(iframeElement);
		
		
		try {
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
