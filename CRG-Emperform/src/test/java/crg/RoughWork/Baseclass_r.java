package crg.RoughWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_r {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
@Test
	public void setup() throws FileNotFoundException {
		if (driver == null) {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			try {
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\ObjectRepository.properties");
			try {
				or.load(fis);

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

}
