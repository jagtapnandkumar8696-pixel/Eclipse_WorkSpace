
package testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assersion {
	@Test
	public void asserttest1()
	{
		String actula="Gmail";
		String expected="Yahoo";
		
		Assert.assertEquals(actula, expected); // it fails test case
		
		System.out.println("After Assertion Test 1"); 
		}
	@Test
	public void asserttest2()
	{
		String actula="Gmail";
		String expected="Yahoo";
		
		Assert.assertFalse(false); //it actualluy pass test
		System.out.println("After Assertion Test 2"); 
		}
	
	@Test
	
	public void asserttest3()
	{
		String actula="Gmail";
		String expected="Yahoo";
		
		Assert.assertFalse(true); //it actualluy fail test
		System.out.println("After Assertion Test 4"); 
		}
	
	
	@Test(groups="Smoke Test")
	public void asserttest5()
	{
		String actula="Gmail";
		String expected="Yahoo";
		
		Assert.assertTrue(true); //it actualluy pass test
		System.out.println("After Assertion Test 5"); 
		}
	
	
	
	@Test
	public void asserttest4()
	{
		String actula="Gmail";
		String expected="Yahoo";
		
		Assert.fail();
		System.out.println("After Assertion Test 4"); 

}
	
}
