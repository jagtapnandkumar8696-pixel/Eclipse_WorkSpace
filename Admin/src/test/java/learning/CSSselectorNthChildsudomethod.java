package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSselectorNthChildsudomethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("select[name='job_role'] :nth-child(2)")).click();
		driver.findElement(By.cssSelector("select[id='job_role'] :first-child")).click();
		driver.findElement(By.cssSelector("select[id='job_role'] :last-child")).click();
		driver.findElement(By.cssSelector("select[id='job_role'] :nth-last-child(1)")).click();
	}

}
