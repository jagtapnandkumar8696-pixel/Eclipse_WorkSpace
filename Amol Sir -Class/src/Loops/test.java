package Loops;

public class test {

	public static void main(String[] args) {
		int row=7;
		int i,j;
		for(i=row;i>=0;i--)
		{
			for(j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for (j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
