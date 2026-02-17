package StringAndArray;

public class PhisicalArray_Revers {

	public static void main(String[] args) {
		
		int ar[] =new int[6];
		int[] rv=new int[6];
		int i,j;
		for( i=0;i<6;i++)
		{
			ar[i]=(int)(Math.random()*100);
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
		for( i=0;i<ar.length;i++)
		{
			rv[i]=ar[ar.length-i-1];
		}
		for( i=0;i<6;i++)
		{
			System.out.print(rv[i]+ " ");
		}

	}

}
