package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSlider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver test=new ChromeDriver();
		test.get("https://jqueryui.com/resizable/");
		test.manage().window().maximize();
		test.switchTo().frame(0);
		System.out.println("switched");
		
       WebElement drag1=test.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
     
       
       Actions action=new Actions(test);
       Thread.sleep(2000);
    
	action.dragAndDropBy(drag1, 100, 80).perform();
	
	}

}
