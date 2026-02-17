package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Following {
//public static WebDriver driver;
	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://developer.salesforce.com/signup");
driver.findElement(By.xpath("//select[@id='country']//following::option[@value='AD']")).click();

	}

}
