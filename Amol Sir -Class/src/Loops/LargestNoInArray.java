package Loops;

public class LargestNoInArray {

	public static void main(String[] args) {
		int ar[] =new int[6];
		int large=0;
		for(int i=0;i<6;i++)
		{
			ar[i]=(int)(Math.random()*100);
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.print(+ar[i]+ " ");
		}
		large=ar[0];
		for(int i=0;i<6;i++)
		{
			if(ar[i]>large)
			{
				large=ar[i];
			}
				
		}
		System.out.println("Large"+large);
	}

}
