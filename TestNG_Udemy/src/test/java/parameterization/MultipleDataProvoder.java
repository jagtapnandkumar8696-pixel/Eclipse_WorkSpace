package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MultipleDataProvoder {
	@DataProvider(name="dp1")
	public Object[][] dataProvider(Method m)
	{
		
	Object	obj[][]=null;
	
	if(m.getName().equals("getName"))
	{
		obj=new Object[2][2];
		obj[0][0]="Nandkumar";
		obj[0][1]="Jagtap";
		
		
		obj[1][0]="Sagar";
		obj[1][1]="Jagtap";
	
		
		
	}
	if(m.getName().equals("getDetailName"))
	{
		obj=new Object[2][3];
		obj[0][0]="Nandkumar";
		obj[0][1]="Jagtap";
		obj[0][2]="njagtap@crgroup.com";
		
		obj[1][0]="Sagar";
		obj[1][1]="Jagtap";
		obj[1][2]="sjagtap@crgroup.com";
		
		
	}
		return obj;
	

}

}