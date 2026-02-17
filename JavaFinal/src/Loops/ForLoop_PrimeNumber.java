package Loops;

import java.util.Scanner;

public class ForLoop_PrimeNumber {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int p=n/2;
		int flag=0;
		if(n==0 || n==1)
		{
			System.out.println("No is not prime");
			
		}
		else
		{
			for (int i=2;i<=p;i++)
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
				System.out.println("No is Prime");
			}
		}
	}

}
