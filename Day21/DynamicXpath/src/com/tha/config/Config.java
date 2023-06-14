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
	
	public void accessElement() {
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div/a[3]")).click();
		
		//relative xpath
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();	
		
	}
	
	public void elementAccess() {
		WebElement elementName=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		elementName.sendKeys("Sumit Raokhande");
//		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("123456");
		
	}
	
	public void att_ElementAccess() {
		//following
//		driver.findElement(By.xpath("(//div[@id='HEADBAND0']//following::li)[2]//a")).click();
		
		//child 
		driver.findElement(By.xpath("(//div[@id='HEADBAND0']//child::li)[3]//a")).click();
		
	}
	

}









