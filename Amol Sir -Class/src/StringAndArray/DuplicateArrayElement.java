package StringAndArray;

import java.util.stream.IntStream;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		int a[]=new int[10];
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
			
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println("Duplicatate element is "+a[j]);
				}
				
			}
			
		}
	}

}
