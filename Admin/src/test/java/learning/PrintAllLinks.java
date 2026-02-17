package learning;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
	List<WebElement> list=	driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getAttribute("href"));
		//System.out.println(list.get(i).getText());
	}
	}

}
// we can also print value under all drop down (single select) by providng tagname ("Option")
//and in getAttribute("Value")