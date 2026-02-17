package array;

public class PrimeNo {

	public static void main(String[] args) {
		int p=13;
		int m=p/2;
		int flag=0;
		if(p==0 || p==1)
		{
			System.out.println("No is not prime");
			
		}
   for(int i=2;i<=m;i++)
   {
	   if (p%i==0)
	   {   flag=1;
	       System.out.println("No is not P");
		   break;
	   }
   }
   if(flag==0)
   {
	   System.out.println("No is prime ");
   }
	}

}
