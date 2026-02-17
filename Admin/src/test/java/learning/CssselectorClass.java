package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.cssSelector("input[class='signUp']")).click();
		driver.findElement(By.cssSelector("input.signUp")).click();
	}

}
