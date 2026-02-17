package Loops;

public class WhileLoop_Palindrom {

	public static void main(String[] args) {
		int n=444;
		int sum=0;
		int s=n;
		while(n>0)
		
		{
			
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(s==sum)
		{
			System.out.println("No is palindrom");
		}
		else
		{
			System.out.println("No is not palindrom");
		}

	}

}
