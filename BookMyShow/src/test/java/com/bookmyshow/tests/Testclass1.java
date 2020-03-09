package com.bookmyshow.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bookmyshow.base.Base;

public class Testclass1 {

	WebDriver driver;
	
	@Test()
	public void testcase1()
	{
		Base base=new Base();
		this.driver=base.driver;
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
	}
	
	@Test()
	public void testcase2()
	{
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Pune");
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);	
	}
	
	@Test()
	public void testcase3()
	{
		driver.findElement(By.xpath("//a[@href='/pune/movies' and text()='Movies']")).click();
	}
	
	
	
	@Test()
	public void testcase4() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("window.scrollBy(0,500)");
		
		//Actions action=new Actions(driver);
		WebElement movie=driver.findElement(By.xpath("//a[@title='Love Aaj Kal']//following::img[1]"));
		//action.moveToElement(movie).click(movie).click().build().perform();
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(movie));
		movie.click();
	}
	
	
	
	@Test()
	public void testcase5()
	{
		WebElement bookTickets=driver.findElement(By.xpath("//a[text()='Book Tickets']"));
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(bookTickets));
		bookTickets.click();
	}
	
	//a[text()='E-Square Carnival Xion, Hinjawadi']//following::div/a[@data-date-time='02:45 PM']
	
	@Test()
	public void testcase6()
	{
	
		driver.findElement(By.xpath("//a[text()='City Pride Royal Cinemas: Rahatani']//following::div/a[@data-date-time='04:45 PM']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		driver.findElement(By.xpath("//ul[@id='popQty']/li[4]")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();

	}
	

}

