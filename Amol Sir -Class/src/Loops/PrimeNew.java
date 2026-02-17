package Loops;

public class PrimeNew {

	public static void main(String[] args) {
		int i,m,flag=0;
		int  n=18;
		m=n/2;
		if (n==0||n==1)
		{
			System.out.println("Number is not prime");
			
		}
		else {
			for (i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("No is not prime");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("No is prime");
			}
		}
	}

}
