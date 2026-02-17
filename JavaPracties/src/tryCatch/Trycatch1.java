package tryCatch;

public class Trycatch1 {
	int m1()
	{
	try {
	   System.out.println("I am in try block");
	  int i=7/0;
	   return 50;
	  }
	catch(Exception e)
	{
	  System.out.println("I am in catch block");
	  //return 31;
	 }
	
	 return 20;
	}
	public static void main(String[] args) 
	{
		Trycatch1 ft = new Trycatch1();
	  System.out.println(ft.m1());
	  }

	

}
