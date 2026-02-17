package Loops;

public class ArraySort {

	public static void main(String[] args) {
		int ar[] =new int[6];
		int i,j, small=0;
		for( i=0;i<6;i++)
		{
			ar[i]=(int)(Math.random()*100);
			System.out.print(ar[i]+ " ");
		}
		for( i=0;i<ar.length;i++)
		{
			for( j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
		System.out.println();
		for( i=0;i<6;i++)
		{
		System.out.print(ar[i]+ " ");
		}
	}

}
