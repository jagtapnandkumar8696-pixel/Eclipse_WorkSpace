package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	SoftAssert a=new SoftAssert();
	@Test(groups="Smoke Test")
	public void method1()
	{
		String s1="Java";
		String s2="Paython";
		//SoftAssert a=new SoftAssert();
		a.assertEquals(s1, s2,"Text box is not present");
		System.out.println("Method1 with soft assert");
		//Condtion is flase but test will not fail as it is soft assert and Assert all() is not used
	}
	@Test(groups="functinal Test")
	public void method2()
	{
		String s1="Java";
		String s2="Paython";
		//SoftAssert a=new SoftAssert();
		a.assertEquals(true, false,"button is absent");
		System.out.println("Method 2 with soft assert");
		a.assertAll();//only this method will fail due to AssertAll()
	}
	
	

}
