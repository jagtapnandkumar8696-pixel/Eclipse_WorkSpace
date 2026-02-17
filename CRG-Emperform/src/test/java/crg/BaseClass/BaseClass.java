package crg.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import crg.Utilities.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public ExcelReader excel=new ExcelReader("C:\\Users\\NANDKUMAR JAGTAP\\eclipse-workspace\\CRG-Emperform\\src\\test\\resources\\excel\\Testdata.xlsx");
	public static org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger("devpinoyLogger");
@BeforeSuite
	public void setup() throws FileNotFoundException {
		if (driver == null) {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			try {
				log.info("Test");
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\ObjectRepository.properties");
			try {
				or.load(fis);
				log.info("Test1");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(config.getProperty("browser").equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if (config.getProperty("browser").equals("fireforx"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}

		}
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
	}
@Test
public boolean isElementPresent(By by)
{
	try {
	driver.findElement(by);
	return true;
	}catch(NoSuchElementException e)
	{
		return false;
	}
}
//@AfterSuite
public void tearDown()
{
	if (driver!=null)
	{
		driver.quit();
	}
}

}

