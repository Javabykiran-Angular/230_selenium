package com.tha.config;

import java.util.Iterator;
import java.util.List;

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
	
	public void loginAccess() {
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		
	}	
	
	public void dashBoard() {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		
		List<WebElement> list_row= driver.findElements(By.tagName("tr"));
		System.out.println("==> row Size => "+list_row.size());
		
		for(int i=1;i<list_row.size();i++) {
			//List<WebElement> list_Col= driver.findElements(By.tagName("td"));
			List<WebElement> list_Col= list_row.get(i).findElements(By.tagName("td"));
			//System.out.println(" => "+list_Col.size());
			
			for(int j=0;j<8;j++) {
				System.out.print(list_Col.get(j).getText()+"\t ");
			}
			System.out.println("");
			
		}
		
		
	}
		
		
	
	
	

}
