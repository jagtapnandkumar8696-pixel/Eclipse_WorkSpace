package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Containfunction {
	static WebDriver driver;

	public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://developer.salesforce.com/signup");
       driver.findElement(By.xpath("//input[contains(@id,'first')]")).sendKeys("test");

	}

}
