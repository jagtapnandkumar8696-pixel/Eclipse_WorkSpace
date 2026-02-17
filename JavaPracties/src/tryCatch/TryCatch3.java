package tryCatch;

public class TryCatch3 {
	int m1()
	{
	try {
	   System.out.println("I am in try block");
	   return 50;
	  }
	catch(Exception e)
	{
	  System.out.println("I am in catch block");
	 }
	 return 20;
	}
	public static void main(String[] args) 
	{
		TryCatch3 ft = new TryCatch3();
	  System.out.println(ft.m1());
	  }

	

}
