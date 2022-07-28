package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics 
{
	//pre-conditions ---Start with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setup Prority of Chrome");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launch chrome Browser");
	}
	@BeforeMethod  
	public void enterUrl()
	{
		System.out.println("Enter Url");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("Login Page");
	}
	//Test Case --- Start With @Test
	@Test
	public void titelTest()
	{
		System.out.println("Title of the Test");
	}
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	@Test
	public void gooogleLogoTest()
	{
		System.err.println("Google Logo Test");
	}
	//Post-Conditions---Start with @After  
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout");
	}
	@AfterTest
	public void deleteAllCockies()
	{
		System.out.println("Delete All Cockies");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}
	@AfterSuite
	public void generateTestReports()
	{
		System.out.println("generateTestReports");
	}
	
}
