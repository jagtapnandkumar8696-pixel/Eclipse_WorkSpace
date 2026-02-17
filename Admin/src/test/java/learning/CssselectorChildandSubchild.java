package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssselectorChildandSubchild {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.cssSelector("select[id='country']>option[value='AD']")).click();// > is use to select child
		driver.findElement(By.cssSelector("form[id='deorg_form'] input[name='user[first_name]']")).sendKeys("test");;// space is use to select sub child
	}

}
