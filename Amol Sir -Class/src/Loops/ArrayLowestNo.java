package Loops;

public class ArrayLowestNo {

	public static void main(String[] args) {
		int ar[] =new int[6];
		int small=0;
		for(int i=0;i<6;i++)
		{
			ar[i]=(int)(Math.random()*100);
		}
		small=ar[0];
		for(int i=0;i<6;i++)
		{
			System.out.print(+ar[i]+" ");
		
		if(small>ar[i])
		{
			small=ar[i];
		}
		
		}
		System.out.println();
System.out.println("Small is "+small);
	}

}
