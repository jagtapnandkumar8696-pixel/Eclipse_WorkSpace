package AmolSir;

public class FibonaciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,count=10,n3;
	System.out.print(n1+" "+n2);
	for(int i=3;i<count;i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3+" ");
		n1=n2;
		n2=n3;
	}

	}

}
