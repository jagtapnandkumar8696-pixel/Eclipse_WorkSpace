package paralellExcution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParalleExecutionwithDataprovider {
	@Test(dataProvider="getData")
	public void getbrowser(String browser)
	{
		System.out.println(browser+ "  is ");
		
		
	}
	@DataProvider(parallel=true)
 public Object[][]getData()
 {
	 Object obj[][]=new Object[2][1];
	 obj[0][0]="Chrome";
 
 obj[1][0]="mozilla";
 return obj;
 
}
}
