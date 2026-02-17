package learning;



import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdwon2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("multi-select"));
		Select select=new Select(element);
		select.selectByIndex(2);
		select.selectByVisibleText("Washington");
		java.util.List<WebElement> test=select.getAllSelectedOptions();
		System.out.println(test.size());
		for (int i=0;i<test.size();i++)
		{
			System.out.println( test.get(i).getText());
		}
		WebElement test2=select.getFirstSelectedOption();
		System.out.println(test2.getText());
		select.deselectAll();
		System.out.println(select.isMultiple());
		
	
		
	}

}
