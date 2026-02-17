package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handleframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.switchTo().frame(0);
		
		System.out.println("frameswtched");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html/body/button")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
	}

}
