package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nandkumars/EP5.4/login/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtLogin")).sendKeys("nj");;
		driver.findElement(By.id("txtPass")).sendKeys("");
		driver.findElement(By.id("cmdLogin")).click();
		
		 
		// Open browser with capability
	
		
		
}
}