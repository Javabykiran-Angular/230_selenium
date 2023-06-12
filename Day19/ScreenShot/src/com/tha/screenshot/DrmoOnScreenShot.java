package com.tha.screenshot;

import com.tha.config.Config;

public class DrmoOnScreenShot extends Config{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrmoOnScreenShot obj=new DrmoOnScreenShot();
		
		obj.driverSetting("https://www.facebook.com/");
		obj.takeScreenShot();

	}

}
