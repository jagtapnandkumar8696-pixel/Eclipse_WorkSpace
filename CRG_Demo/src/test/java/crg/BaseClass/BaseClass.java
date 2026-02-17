package crg.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import crg.Utilities.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties con=new Properties();
	public static Properties or=new Properties();
	public ExcelReader excel=new ExcelReader("C:\\Users\\NANDKUMAR JAGTAP\\eclipse-workspace\\CRG_Demo\\src\\test\\resources\\excel\\Testdata.xlsx");
	public static org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger("devpinoyLogger");
	@BeforeSuite
	public void setup() throws IOException
	{
		if(driver==null)
		{
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
				con.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\ObjectRepository.properties");
			or.load(fis);
			if(con.getProperty("browser").equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			if(con.getProperty("browser").equals("fireforx"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new FirefoxDriver();
			}
			driver.get(con.getProperty("url"));
			driver.manage().window().maximize();
		}
	}

}
