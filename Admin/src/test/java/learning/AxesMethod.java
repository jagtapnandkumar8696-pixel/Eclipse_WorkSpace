package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxesMethod {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.findElement(By.xpath("//select[@id='job_role']//child::option[2]")).click();
		driver.findElement(By.xpath("//select[@name='user[country]']//self::select")).click();
		
		
	}

}
