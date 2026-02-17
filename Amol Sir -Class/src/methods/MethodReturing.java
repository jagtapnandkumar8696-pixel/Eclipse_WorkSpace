package methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodReturing {
	public boolean return1()
	{
		boolean b=(10>11);
		return b;
	}
	public Date dateReturn() throws ParseException 
	{  String str="12/12/2020";
		SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
		Date date=sd.parse(str);
		return date;
				
		
	}
	
	public String returnString()
	{
		String str="Java";
		return str;
	}
	
	public  MethodsWithArguments returnobj()
	
	{
		MethodsWithArguments m=new MethodsWithArguments();
		m.a=1;
		return m;
		
	}
	
	public int[] returnArray()
	{
		int x[]= {12,13,15,16};
		return x;
	}
	
	public int[][] return2DArray()
	{
		int x[][]= {{1,2,3,4},{9,8,7,6}};
		return x;
	}

	public static void main(String[] args) throws ParseException {
		MethodReturing m=new MethodReturing();
		boolean b=m.return1();
		System.out.println(b);
		Date date=m.dateReturn();
		System.out.println(date);
		String str=m.returnString();
		System.out.println(str);
		System.out.println(m.returnobj());
		MethodsWithArguments t=m.returnobj();
        t.display();
        int a[]=m.returnArray();
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        
        int c[][]=m.return2DArray();
        
        for (int i=0;i<c.length;i++)
        {
        	for (int j=0;j<c[0].length;j++)
        	{
        		System.out.print(c[i][j]+ " ");
        	}
        	System.out.println();
        }
	}

}
