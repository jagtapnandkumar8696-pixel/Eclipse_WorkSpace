package AmolSir;

public class Pallindrom {

	public static void main(String[] args) {
		int r;
		int sum=0;
		int n=757;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("N");
		}

	}

}
