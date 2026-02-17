package crg.RoughWork;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestProperties {
	
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException

	{
		Properties config=new Properties();
		Properties or=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\ObjectRepository.properties");
		or.load(fis);
		System.out.println(or.getProperty("bmlButton"));
		driver.findElement(By.cssSelector(or.getProperty("bmlButton"))).click();;
	
	}
	

}

