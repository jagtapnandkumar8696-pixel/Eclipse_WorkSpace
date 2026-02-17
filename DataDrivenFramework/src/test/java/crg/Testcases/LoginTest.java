package crg.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import crg.BaseClasses.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginAsManager() throws InterruptedException, FileNotFoundException
	{   
		log.debug("Execution started");
		driver.findElement(By.cssSelector(or.getProperty("bmlButton"))).click();
		Thread.sleep(3000);
		//System.out.println("test");
		
		//Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("addcusButton"))),"Login Failed");
		
		
	}
	

}
