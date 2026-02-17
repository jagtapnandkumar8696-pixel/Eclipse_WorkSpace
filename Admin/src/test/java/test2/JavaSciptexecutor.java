package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSciptexecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jexecutor=(JavascriptExecutor)driver;
		String script="return document.title;";
		Thread.sleep(2000);
	String title1=(String) jexecutor.executeScript(script);
	System.out.println((String)jexecutor.executeScript("return document.URL"));
	Thread.sleep(2000);
	System.out.println(title1);
	
	Thread.sleep(2000);
	//click button using function..no need to find button
	driver.switchTo().frame("iframeResult");
	System.out.println("Switched");
	Thread.sleep(2000);
	jexecutor.executeScript("myFunction()");
	driver.switchTo().alert().accept();
	WebElement button = driver.findElement(By.xpath("/html/body/button"));
	jexecutor.executeScript("arguments[0].style.background='yellow'", button);

  //  String javascript = "document.getElementById('email').style.background='yellow'";  
  //  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
  //  jsExecutor.executeScript(javascript);  

	
		
		
	}

}
