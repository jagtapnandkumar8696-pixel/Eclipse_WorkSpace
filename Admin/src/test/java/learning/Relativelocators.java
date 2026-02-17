package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativelocators {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://developer.salesforce.com/signup");
        WebElement email=driver.findElement(By.id("email"));
        Thread.sleep(2000);
        driver.findElement(withTagName("input").above(email)).sendKeys("Nandkumar");
        //asloabove,lefttoof ,righttoof and near locators we can use
      
     
                                                          
       
        		
        		
        		
        		
        		
	}
	

}
