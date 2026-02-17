package screenshotOnTestfailure;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_N {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
		if(driver==null)
		{ 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		
	}
	@AfterSuite
	public void tearDpwn()
	{
		driver.quit();
	}

}
