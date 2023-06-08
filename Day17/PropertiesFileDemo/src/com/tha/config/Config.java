package com.tha.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void driverSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		
		
		driver.get(accessProperties());
	}
	
	
	public String accessProperties() {
		String strUrl="";
		try {
			FileInputStream fis=
					new FileInputStream("D:\\Selenium_Workspace_230\\configurationFiles\\myfile.properties");
			
			Properties props=new Properties();
			props.load(fis);
			System.out.println("Username => "+props.getProperty("username"));
			System.out.println("Password => "+props.getProperty("password"));
			
			System.out.println("Url => "+props.getProperty("url"));
			 strUrl=props.getProperty("url");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return strUrl;
		
	}

}
