package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorCombine {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		
		driver.findElement(By.cssSelector("input[id='postal_code'][name='user[postal_code]']")).sendKeys("412301");
	    Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("412301");
	}

}
