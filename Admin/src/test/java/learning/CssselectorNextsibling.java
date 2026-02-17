package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorNextsibling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.findElement(By.cssSelector("option[value='Developer']+option[value='Architect/CTO']")).click();

	}

}
