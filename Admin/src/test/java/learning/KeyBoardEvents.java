package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver test=new ChromeDriver();
		test.get("https://jqueryui.com/");
		test.manage().window().maximize();
		//test.switchTo().frame(0);
		//System.out.println("switched");
		Thread.sleep(8000);
		
      WebElement drag1= test.findElement(By.linkText("Download"));
      
     
       
     Actions action=new Actions(test);
       Thread.sleep(2000);
   //to perofrm right click at currect maus position
    //   action.contextClick().perform();
       //to perform right click on webelement 
	action.contextClick(drag1).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	action.build().perform();
	
	System.out.println("done");
	
	}

}
