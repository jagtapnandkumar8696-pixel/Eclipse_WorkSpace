package testngListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailForlistner {

	@Test
 public void login()
 
 {
		
		Assert.fail("Failing Test");
		System.out.println("Method is failed");
	 
 }
}
