package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver test=new ChromeDriver();
		test.get("https://extendsclass.com/text-compare.html");
		test.manage().window().maximize();
		WebElement element=test.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		Actions action=new Actions(test);
		Thread.sleep(2000);
		
		action.keyDown(element,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement target=test.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[3]/pre/span"));
		Thread.sleep(2000);
		
		action.keyDown(target,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
        
		
	
	}

}
