package array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {2,5,1,3,6,8,5};
		int b[];
		int temp,i,j;
		
		for ( i=0;i<a.length;i++)
		{
			for (j=1+i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for ( i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Second Smallest "+a[1]);
		}
	}


