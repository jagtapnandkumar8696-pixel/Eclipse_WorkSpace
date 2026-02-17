package crg.TestCases;



import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crg.BaseClass.BaseClass;

public class Login extends BaseClass{
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("bmlButton"))).click();
		Thread.sleep(2000);


	}

}
