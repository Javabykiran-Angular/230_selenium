package com.tha.window;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnWindow {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Config obj=new Config();
		obj.SetBrowser();
		

		/*
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		this.driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
		
		WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
			emailElement.sendKeys("kiran@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		//PDf Selenium
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		
		//PDf java/Jee
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		
		//PDf Python
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();		

		//PDf PHP
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		
		//Handle a window tabs
		
		
		 ArrayList<String> list= new ArrayList<String>( driver.getWindowHandles());
		 
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++) {
			 
			 System.out.println(list.get(i));
			 
			 if(i!=0) {
				 
				 driver.switchTo().window(list.get(i));
				 driver.close();
				 
			 }
			 
			 
//			 if(i==4) {
//				 
//				 driver.switchTo().window(list.get(i));
//				 driver.close();
//				 
//			 }
//			 
			 
		 }
		 
		 driver.switchTo().window(list.get(0));
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();	 
		 	 */
		

	}

}
