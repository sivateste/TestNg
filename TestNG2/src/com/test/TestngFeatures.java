package com.test;

import org.testng.annotations.Test;

public class TestngFeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		//int a=9/0;                       //invalid
	}

	@Test(dependsOnMethods ="loginTest") //this this login page related ,login page failed its not run skip 
	public void homepageTest()
	{
		System.out.println("Home Page");
	}
	@Test(dependsOnMethods ="loginTest")//this this login page related login page failed its not run skip 
	public void searchPageTest()
	{
		System.out.println("Search Page");
	}
	@Test(dependsOnMethods ="loginTest")//this this login page related login page failed its not run skip 
	public void regPageTest()
	{
		System.out.println("Register Page");
	}
}
