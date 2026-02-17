package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicmethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		String str=driver.getCurrentUrl();
		System.out.println("url is"+str);
		String str2=driver.getTitle();
		System.out.println(str2);
		String str3=driver.getPageSource();
		System.out.println(str3);
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://www.google.com");
		driver.close();
	
	}

}
