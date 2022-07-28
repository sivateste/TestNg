package com.DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimusBankTestData {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com");	
	}
	
	@Test(dataProvider = "passData")
	public void Login(String uname,String Pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		//System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		System.out.println("Page is verified - login successful");
	}
	@DataProvider
	public Object[][] passData()
	{
		Object [][] data =new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="Qedge123!@#";
		
		data[1][0]="Admin";
		data[1][1]="Qedge123";
		
		data[2][0]="Admin123";
		data[2][1]="Qedge123!@#";
		
		
		return data;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
