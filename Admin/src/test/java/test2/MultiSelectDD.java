package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDD {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("multi-select"));
		Select select=new Select(element);
		select.selectByIndex(1);
		select.selectByIndex(2);
		List<WebElement> list=select.getAllSelectedOptions();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		

	}

}
