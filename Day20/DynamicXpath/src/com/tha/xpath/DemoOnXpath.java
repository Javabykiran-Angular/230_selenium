package com.tha.xpath;

import com.tha.config.Config;

public class DemoOnXpath extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnXpath obj=new DemoOnXpath();
		//obj.driverSetting("https://www.w3schools.com/");
		obj.driverSetting("http://register.rediff.com/register/register.php?FormName=user_details");
		//obj.accessElement();
		obj.elementAccess();

	}

}
