package screenshotOnTestfailure;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseforLogin_N extends BaseClass_N {
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@type='email12']")).sendKeys("jagtap.nandkumar8696@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[1]/button[1]/span[1]")).click();
		
	}

}
