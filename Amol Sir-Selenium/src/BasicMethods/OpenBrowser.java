package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class OpenBrowser {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver","C:/Users/NANDKUMAR JAGTAP/eclipse-workspace/Amol Sir-Selenium/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

	}

}
