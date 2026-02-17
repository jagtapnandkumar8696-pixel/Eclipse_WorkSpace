package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void setUp()
	{
		System.out.println("All setup is done");
	}
@AfterSuite
	public void tearDown()
	{
		System.out.println("Quit All sessions");
	}
	
}
