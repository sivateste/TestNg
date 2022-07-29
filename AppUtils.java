package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils {
	
public static WebDriver driver;
	
	@BeforeTest
	public static void LaunchApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	
	}
   
	@AfterTest
	public static void AppClose()
	{
		driver.close();
	}

}
