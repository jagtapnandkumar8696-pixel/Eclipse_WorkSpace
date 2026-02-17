package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	@Test(dataProvider="getData")
	public void login(String login,String password)
	{
		System.out.println("logged in successuflly");
		System.out.println(login+"    "+password);
		
	}
@DataProvider
	public Object[][] getData()
	{
		
		Object[][] test=new Object[3][2];
		test[0][0]="njagtap@gmail.com";
		test[0][1]="123";
		
		test[1][0]="njagtap@gmail.com";
		test[1][1]="123";
		
		test[2][0]="njagtap@gmail.com";
		test[2][1]="123";
		return test;
	}
}
