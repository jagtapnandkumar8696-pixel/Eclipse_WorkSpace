package screenshotOnTestfailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReRunTest {
	public static int count=0;
	@Test
	public void login()
	{
		System.out.println("Test run Successfully");
	}
	@Test
	public void registration()
	{
		count++;
		Assert.assertEquals(count, 4);
		
	}
}
