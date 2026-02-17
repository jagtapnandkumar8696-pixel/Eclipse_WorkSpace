package basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://stock.scriptinglogic.net/");
	driver.findElement(By.id("login-username")).sendKeys("admin");
	driver.findElement(By.id("login-password")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	WebElement element=driver.findElement(By.linkText("add_customer.php"));
	// driver.findElement(withTagName("input").above(element)).sendKeys("Nandkumar");

	}

}
