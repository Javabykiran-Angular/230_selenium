package com.tha.wait;

import com.tha.config.Config;

public class DemoOnWait extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOnWait obj=new DemoOnWait();
		obj.driverSetting("https://www.qa.jbktest.com/");
		obj.waitinSelenium();

	}

}
