package array;

public class PalindromNo {

	public static void main(String[] args) {
		int n=4441444;
		int r;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrpm");
			
		}
		else
		{
			System.out.println("No");
		}
	}

}
