package com.tha.basic;

import com.tha.config.Config;

public class DemoOnModify extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoOnModify obj=new DemoOnModify();
		
		obj.driverSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.loginAccess();
		
//		Config configObj=new Config();
//		configObj.driverSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
//		configObj.loginAccess();		
		
		
	}

}
