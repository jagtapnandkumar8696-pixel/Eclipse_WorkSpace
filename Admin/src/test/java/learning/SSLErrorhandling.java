package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLErrorhandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// This part is global for all browsers
		DesiredCapabilities dc=new DesiredCapabilities();
		System.out.println("yesy");
		dc.setAcceptInsecureCerts(true);
		WebDriverManager.firefoxdriver().setup();
	
		//This part is for browser specific
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions coption=new ChromeOptions();
		FirefoxOptions test=new FirefoxOptions ();
		
		test.merge(dc);
		
		WebDriver driver=new FirefoxDriver(test);
		
		
		
		driver.get("https://nandkumars/EP5.4/login/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtLogin")).sendKeys("nj");
		driver.findElement(By.id("txtPass")).sendKeys("");
		driver.findElement(By.id("cmdLogin")).click();
		
		 
		// Open browser with capability
	
		
		
}
}