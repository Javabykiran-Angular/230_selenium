package com.tha.table;

import com.tha.config.Config;

public class DemoOnTable extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnTable obj=new DemoOnTable();
		obj.driverSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.loginAccess();
		obj.dashBoard();
		

	}

}
