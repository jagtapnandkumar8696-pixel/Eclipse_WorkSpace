package paralellExcution;

import org.testng.annotations.Test;

public class CallingclassInvocation extends BaseClassforInvocationCount {
	@Test(invocationCount=2,threadPoolSize=2)
	 public void lounch()
	 {
		 //when we extend class we directly call methods of base class 
		 driver=getData("chrome");
		 driver.get("http://google.com");
		 System.out.println(driver.getTitle());
		 driver.quit();
	 }

}
