package learning;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		Set<String> s1=driver.getWindowHandles();
		Thread.sleep(2000);
		java.util.Iterator<String> i1= s1.iterator();
		Thread.sleep(2000);
		String parent=i1.next();
		Thread.sleep(2000);
		String child=i1.next();
		driver.switchTo().window(child);
		System.out.println("swtiched");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='UserFirstName-rLSV']")).sendKeys("test");
		driver.findElement(By.name("UserFirstName")).sendKeys("test");
		driver.switchTo().window(parent);
		
	}

}
