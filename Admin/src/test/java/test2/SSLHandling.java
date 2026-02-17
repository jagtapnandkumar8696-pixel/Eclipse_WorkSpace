package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		ChromeOptions co=new ChromeOptions();
		co.merge(dc);
		WebDriver driver=new ChromeDriver(co);
		

	}

}
