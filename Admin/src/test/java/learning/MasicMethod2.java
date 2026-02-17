package learning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasicMethod2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.getWindowHandle();
       // String str =driver.getWindowHandle();
       // System.out.println("Handle is "+str);
       List<WebElement> list1= driver.findElements(By.xpath("//div[@class='inventory_item']"));
      System.out.println(list1);
      Set<String> str1=driver.getWindowHandles();
       
       System.out.println(str1);
	}

}
