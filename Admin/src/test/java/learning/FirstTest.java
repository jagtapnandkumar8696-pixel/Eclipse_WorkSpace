package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class FirstTest {
	public static WebDriver driver;
	public static String browser="chrome";

	public static void main(String[] args)
	{
		if(browser.equals("chrome")) {
			
		
	
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.findElement(By.xpath("//select[@name='user[country]']//parent::select")).click();
		}
	}

}
