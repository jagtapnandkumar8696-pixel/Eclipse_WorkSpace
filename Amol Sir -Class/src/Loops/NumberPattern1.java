package Loops;

public class NumberPattern1 {

	public static void main(String[] args) {
		int i,j;
		int k=1;
		for (i=0;i<6;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(k++ +" ");
				//k++;
			}
			System.out.println();
		}
	}

}
