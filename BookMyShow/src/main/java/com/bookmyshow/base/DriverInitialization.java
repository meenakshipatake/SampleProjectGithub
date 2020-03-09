package com.bookmyshow.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInitialization {

	private static WebDriver driver;
	private static DriverInitialization driverInitialization=null;
	
	private DriverInitialization()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meenu\\eclipse-workspace\\BookMyShow\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
	}
	
	private static WebDriver initializeDriver()
	{
		if(driverInitialization==null)
		{
			DriverInitialization driverInitialization =new DriverInitialization();
			
		}
		
		return driver;
		
	}
	
	
	public static WebDriver getDriver()
	{
		return initializeDriver();
		
	}
	
	
	
}
