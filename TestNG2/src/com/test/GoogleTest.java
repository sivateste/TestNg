package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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
	@Test(priority=5,groups="Title")
	public void googletitle()
	{
		String title =driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="Google Image")
	public void getImageTest()
	{
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	}
	@Test(priority=6,groups="gmail")
	public void getGmailTest()
	{
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=3,groups="Google search")
	public void googleSearchTest()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	}
	@Test(priority=4,groups="Google test")
	public void clickGoogletest()
	{
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
