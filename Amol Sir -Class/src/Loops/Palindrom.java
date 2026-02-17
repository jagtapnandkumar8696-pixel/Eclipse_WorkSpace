package Loops;

public class Palindrom {

	public static void main(String[] args) {
		int r;
		int n=444;
		int sum=0;
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
				if(sum==temp)
				{
				System.out.println("palindrom");	
				}
				else
				{
					System.out.println("not p");
				}

	}

}
