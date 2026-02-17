package learning;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		//As check box is at lowe part so that we have to scroll down...for that we are useing Action class
		//we have o scroll till Radio button is visble so first we have to find that radio buttn
		Thread.sleep(2000);
		WebElement web=driver.findElement(By.id("doi0"));
		Thread.sleep(2000);
		Actions test=new Actions(driver);
		Thread.sleep(2000);
		test.moveToElement(web);
		Thread.sleep(2000);
		driver.findElement(By.id("interest_market_c0")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		//check all check box 
		List<WebElement> test2=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		System.out.println(test2.size());
		for(int i=0;i<test2.size();i++)
		{
			test2.get(i).click();
		}
	}

}
