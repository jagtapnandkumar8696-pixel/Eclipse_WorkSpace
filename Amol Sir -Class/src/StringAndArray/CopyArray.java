package StringAndArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CopyArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[a.length];
		int[] intArray = new int[]{1, 1, 5,1,2,3,4,9,5,6};
		int[] intArray1 = IntStream.range(1, 11).toArray();
		int d[]=new int[a.length];
		for (int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
			
		}
		Arrays.sort(a);
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		for (int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(b[i] +" ");
			
			
		}
		if(a==b)//it always return faulse even though size and Content is same 
		{
			System.out.println("a and b same");
		}
			else
			{
				System.out.println("a and b Not same ");
			}
		int c[]=b.clone();//to copy array 
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
		if(Arrays.equals(a, intArray))//it check  values in side 
		{
			System.out.println("Its equals");
		}
		
	}

}
