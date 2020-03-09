package com.bookmyshow.base;

import org.openqa.selenium.WebDriver;

public class Base {

	public WebDriver driver;
	
	public Base()
	{
		
		driver=DriverInitialization.getDriver();
		
	}
	
}
