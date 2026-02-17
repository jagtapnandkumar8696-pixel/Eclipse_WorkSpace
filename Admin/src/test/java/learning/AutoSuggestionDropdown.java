package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='From']")).click();
        Thread.sleep(2000);
        WebElement form=driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(2000);
        form.sendKeys("sydney");
        Thread.sleep(2000);
        form.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        form.sendKeys(Keys.ENTER);

}
}