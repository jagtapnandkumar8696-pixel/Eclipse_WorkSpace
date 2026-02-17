package test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver test=new ChromeDriver();
		test.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		WebElement web=test.findElement(By.xpath("//div[@class='range']//child::input"));
		Actions action=new Actions(test);
		test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.dragAndDropBy(web, -120, 200).perform();

	}

}
