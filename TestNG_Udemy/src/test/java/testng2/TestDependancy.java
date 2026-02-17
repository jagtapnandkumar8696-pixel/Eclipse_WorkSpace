package testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

import testng.BaseClass;

public class TestDependancy extends BaseClass { //this calss is used in 2ndtestng xml...used for BeforeSuit/AfterSuits option
	@Test (priority=1)
	public void userregistration()
	{
		System.out.println("User registered");
		//Assert.fail();
		//test get fail
	}
	
	
	@Test(priority=2,dependsOnMethods="userregistration")
	public void login()
	{
		System.out.println("User logged in ");
		//if userregistration method fails ..login get skip as it is depends on userregistration
	}
	
	
	@Test(priority=3,dependsOnMethods="userregistration",alwaysRun=true)
	public void registerAgain ()
	{
		System.out.println("User registered  again ");
		//if userregistration method fails ..registeragain method not get skip even though it si dependent...but alwaysrun=true 
	}
	
	@Test(priority=4)
	public void independentMethod ()
	{
		System.out.println("Method is independent  ");
		
	}

}
