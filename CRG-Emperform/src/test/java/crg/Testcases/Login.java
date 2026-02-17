package crg.Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import crg.BaseClass.BaseClass;

public class Login extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(or.getProperty("bmlButton"))).click();
		Thread.sleep(2000);
		Assert.assertTrue((isElementPresent(By.cssSelector(or.getProperty("addcusButton")))),"Login is not Successful");
		Thread.sleep(2000);
	}

}
