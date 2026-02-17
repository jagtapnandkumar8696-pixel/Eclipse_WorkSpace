package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExictor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//print page tile
		//press f12 and in console type Document.title...also we can get document.get to get elements..and use return key word
		JavascriptExecutor jexecutor=(JavascriptExecutor)driver;
		String script="return document.title;";
		Thread.sleep(2000);
	String title1=(String) jexecutor.executeScript(script);
	System.out.println((String)jexecutor.executeScript("return document.title"));
	Thread.sleep(2000);
	System.out.println(title1);
	
	Thread.sleep(2000);
	//click button using function..no need to find button
	driver.switchTo().frame("iframeResult");
	System.out.println("Switched");
	Thread.sleep(2000);
	jexecutor.executeScript("myFunction()");
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//hightlight button 
	WebElement button = driver.findElement(By.xpath("/html/body/button"));
	Thread.sleep(2000);
	jexecutor.executeScript("arguments[0].style.border='2px solid red'",button);
	Thread.sleep(2000);
	// Scroll page
	driver.navigate().to("https://www.w3schools.com");
	Thread.sleep(2000);
	
	WebElement scroll=driver.findElement(By.xpath("//*[@id=\"main\"]/div[11]/p/a"));
	Thread.sleep(2000);
	jexecutor.executeScript("arguments[0].scrollIntoView();", scroll);

	
	
	
	/*	
		
		System.out.println("frameswtched");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html/body/button")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();*/
	}

}
