package Loops;

public class FibonaciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int f=1;
		System.out.print(n1+" "+n2);
		while(f<10)
		{
			n3=n1+n2;
			System.out.print(" "+n3+" ");
			n1=n2;
			n2=n3;
			f++;
		}
				
	}

}
