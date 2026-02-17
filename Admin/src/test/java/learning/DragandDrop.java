package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver test=new ChromeDriver();
		test.get("http://jqueryui.com/droppable/");
		test.manage().window().maximize();
		test.switchTo().frame(0);
		
       WebElement drag1=test.findElement(By.id("draggable"));
       Thread.sleep(2000);
       WebElement drag2=test.findElement(By.id("droppable"));
       
       Actions action=new Actions(test);
       Thread.sleep(2000);
       action.dragAndDrop(drag1, drag2).perform();
	}

}
