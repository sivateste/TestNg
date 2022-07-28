package com.DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestcase {

	static WebDriver driver;
	@BeforeTest
	public void applogin()
	{
		driver =new ChromeDriver();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
	}
	
		@Test(dataProvider="supplyData")
		public void loginPage(String uname,String pwd) throws InterruptedException{
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			driver.findElement(By.id("txtUsername")).sendKeys(uname);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			String exp="dashboard";
			String act=driver.getCurrentUrl();
			if(act.contains(exp))
			{
				Reporter.log("Login succssful",true);
			}else
			{
				Reporter.log("Login Faild",true);
			}
		}
		
		@DataProvider
		 public Object [][] supplyData()
		{
			String login[][]=new String[2][2];
			login[0][0]="Admin";
			login[0][1]="Qedge123!@#";
			login[1][0]="dhjjhed";
			login[1][1]="cdbjebj";
			return login;	
		}
		@AfterTest()
		public void close()
		{
			driver.close();
		}

	
	
}
