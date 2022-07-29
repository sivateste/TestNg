package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.AppUtils;

public class LoginTestcase extends AppUtils {


	@Test (dataProvider="supplyData") 
	public void loginPage(String uname,String pwd) throws InterruptedException{
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
	@Test (priority=1)
	public void logOut()
	{
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("//a[text()='Logout']"))));
		driver.findElement(By.linkText("Logout")).click();
	}

}
