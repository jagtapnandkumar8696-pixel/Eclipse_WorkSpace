package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdwon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		Select test=new Select(driver.findElement(By.name("employees_c")));
		test.selectByIndex(3);
		test.selectByValue("level2");
		test.selectByVisibleText("101 - 250 employees");
		driver.findElement(By.xpath("//option[@disabled='disabled']")).click();
		
	}

}
