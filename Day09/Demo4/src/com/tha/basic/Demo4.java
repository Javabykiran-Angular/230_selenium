package com.tha.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium_Software2/Offline%20Website/index.html");
		
		WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
			emailElement.sendKeys("kiran@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		WebElement courseElemnent= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small"));
		String strCourse=courseElemnent.getText();
		System.out.println("=> "+strCourse);
		//User
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		//AddUser
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		//username
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sumit");
		//Mobile
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		//Email
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@gmnail.com");
		//Course
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		//Gender
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		//Drop down automation
		WebElement dropDownElement= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select select=new Select(dropDownElement);
		
//		select.selectByIndex(2);
		
//		select.selectByValue("Maharashtra");
		
		select.selectByVisibleText("HP");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		
	//	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7536987122");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("7536987122");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		
		

	}

}
