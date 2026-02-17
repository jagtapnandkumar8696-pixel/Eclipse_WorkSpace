//package crg.BaseClasses;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import crg.Utilites.ExcelReader;
//
//
//public class TestBase {
//
//	public static WebDriver driver;
//	public static Properties config = new Properties();
//	public static Properties or = new Properties();
//	public static FileInputStream fis;
//	public static Logger log = Logger.getLogger("devpinoyLogger");
//	public static ExcelReader exlreader= new ExcelReader("C:\\Users\\NANDKUMAR JAGTAP\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\Testdata.xlsx");
//
//	@BeforeSuite
//	public void setUp() throws FileNotFoundException {
//		if (driver == null) {
//			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
//			try {
//
//				config.load(fis);
//				log.info("Config file loaded");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			fis = new FileInputStream(
//					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\ObjectRepository.properties");
//			try {
//				or.load(fis);
//				log.debug("or file loaded");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if (config.getProperty("browser").equals("chrome")) {
//				// WebDriverManager.chromedriver().setup();
//				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\chromedriver.exe");
//				driver = new ChromeDriver();
//				log.debug("chrome launched");
//			} else if (config.getProperty("browser").equals("mozilla")) {
//				// WebDriverManager.firefoxdriver().setup();
//				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\executable\\geckodriver.exe");
//				driver = new FirefoxDriver();
//			}
//
//			driver.get(config.getProperty("url"));
//			log.debug("url loaded");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicite.wait")),
//					TimeUnit.SECONDS);
//
//		}
//
//	}
//@Test
//	public boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		}catch(NoSuchElementException e){
//			
//			return false;
//		}
//
//	}
//
//	@AfterSuite
//	public void tearDown() {
//		if (driver != null) {
//			log.debug("Execution completed");
//			driver.quit();
//		}
//
//	}
//
//}

package crg.BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import crg.Utilites.ExcelReader;


public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader exlreader= new ExcelReader("C:\\Users\\NANDKUMAR JAGTAP\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\excel\\Testdata.xlsx");

@BeforeSuite
public void setUp() throws FileNotFoundException {

    if (driver == null) {

        fis = new FileInputStream(System.getProperty("user.dir")
                + "\\src\\test\\resources\\properties\\Config.properties");
        try {
            config.load(fis);
            log.info("Config file loaded");
        } catch (IOException e) {
            e.printStackTrace();
        }

        fis = new FileInputStream(System.getProperty("user.dir")
                + "\\src\\test\\resources\\properties\\ObjectRepository.properties");
        try {
            or.load(fis);
            log.debug("OR file loaded");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (config.getProperty("browser").equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            log.debug("Chrome launched");

        } else if (config.getProperty("browser").equalsIgnoreCase("mozilla")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            log.debug("Firefox launched");
        }

        driver.get(config.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(
                Integer.parseInt(config.getProperty("implicite.wait")),
                TimeUnit.SECONDS
        );
    }
}

@Test
public boolean isElementPresent(By by) {
	try {
		driver.findElement(by);
		return true;
	}catch(NoSuchElementException e){
		
		return false;
	}

}

@AfterSuite
public void tearDown() {
	if (driver != null) {
		log.debug("Execution completed");
		driver.quit();
	}

}

}

