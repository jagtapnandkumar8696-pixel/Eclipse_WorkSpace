package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	
	@Test (priority=2)
	public void login()
	{
		System.out.println("login");
	}
	
	
	@Test(priority=1)
	public void userregistration()
	{
		System.out.println("User registred");
	}

	
	@BeforeMethod
	public void launchbrowser()
	{
		System.out.println("Browser lunch");
	}
	
	
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("Browser close");
	}
	
	
	@BeforeTest
	public void createDBConnection()
	{
		System.out.println("connection created");
	}
	
	@AfterTest
	public void closeDBConnection()
	{
		System.out.println("connection closed");
	}
	
	
}
