package parameterization;

import org.testng.annotations.Test;

public class MultipleDataReciver {
	@Test(dataProviderClass=MultipleDataProvoder.class,dataProvider="dp1")
	public void getName(String fname,String lname)
	{
		System.out.println(fname+"---"+lname+"---");

}
	
	@Test(dataProviderClass=MultipleDataProvoder.class,dataProvider="dp1")
	
	public void getDetailName(String fname,String lname,String email)
	{
		System.out.println(fname+"---"+lname+"---"+email+"---");

}
	
	
}

