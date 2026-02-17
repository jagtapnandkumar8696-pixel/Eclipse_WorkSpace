package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Best123 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement web=driver.findElement(By.name("States"));
		Select select=new Select(web);
          select.selectByIndex(2);
          select.selectByIndex(3);
          Thread.sleep(2000);
          select.deselectAll();
          select.selectByIndex(2);
          select.selectByIndex(3);
          WebElement test=select.getFirstSelectedOption();
          System.out.println(test.getText());
          java.util.List<WebElement> test1=select.getAllSelectedOptions();
  		System.out.println(test1.size());
  		for(int i=0;i<test1.size();i++)
  		{
  			System.out.println(test1.get(i).getText());
  		}

	}

}
