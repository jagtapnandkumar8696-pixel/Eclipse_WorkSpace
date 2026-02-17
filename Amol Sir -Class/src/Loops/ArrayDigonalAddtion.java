package Loops;

public class ArrayDigonalAddtion {
	//static int sum=0;

	public static void main(String[] args) {
	int array[][]=new int[3][3];
	int sum=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			array[i][j]=(int) (Math.random()*10);
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(array[i][j]+" ");
			if(j==i)
			{
				sum=sum+array[i][j];
			}
		}
		System.out.println();
	
		
	}
	System.out.println(sum);
	}

}
