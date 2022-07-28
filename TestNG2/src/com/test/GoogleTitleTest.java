package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");	
	}
	@Test()
	public void googletitle()
	{
		String title =driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google","Title is match");
	}
	
	@Test()
	public void getGmailTest()
	{
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
		
		Assert.assertTrue(b);
		Assert.assertEquals(b,true);
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
