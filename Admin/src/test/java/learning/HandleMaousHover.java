package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMaousHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		WebElement test=driver.findElement(By.linkText("Electronics"));
		Actions action=new Actions(driver);
		action.moveToElement(test).perform();
		
		//In this case it wait till max 10 seconds and the throw exception , but element will found in 2 second then it will not wail till 10 seconds..wait go further in 2 seconds
		
		

	}

}
