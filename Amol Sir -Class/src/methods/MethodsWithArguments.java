package methods;

import java.util.Date;

import resources.Resource;

//import org.apache.xmlgraphics.io.Resource;

//import java.sql.Date;

public class MethodsWithArguments {
	public int a=4;
	public void display()
	{
		System.out.println(a);
	}
	public void arrgumentInt(int a,boolean b,char c)
	{
		System.out.println("a is -->" +a);
		System.out.println("b is -->" +b);
		System.out.println("c is -->" +c);
	}
	
	public void argumentString(String str)
	{
		System.out.println("str is -->" +str);
	}
	public void argumentDate(Date d)
	{
		System.out.println("Date is -->" +d);
	}
	public void argumentArray(int a[])
	
		
	{
		for(int i=0;i<a.length;i++)	
		{
			System.out.println(a[i]);
		}
	}
	public void argumrntTwoDiArray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{   
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public void argumrntObject(Resource r)
	{
		r.a=1;
		r.c="Test";
		System.out.println("a ="+r.a);
		System.out.println("c ="+r.c);
		
	}
	public static void main(String[] args)
	{
		MethodsWithArguments m=new MethodsWithArguments();
		Date date=new Date();
		m.argumentDate(new Date());
		m.argumentDate(date);
		m.argumentString("java testing");
		m.arrgumentInt(1, false, 'c');
		int x[]= {1,5,3,8,9,5};
		m.argumentArray(x);
		int a [][]= {{1,2,3,4},{9,8,7,6}};
		m.argumrntTwoDiArray(a);
		Resource r=new Resource();
		
		m.argumrntObject(r);
	}

}
