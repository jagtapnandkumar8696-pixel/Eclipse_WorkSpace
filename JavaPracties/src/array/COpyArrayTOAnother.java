package array;

import java.util.Arrays;

public class COpyArrayTOAnother {

	public static void main(String[] args) {
		int[] input = {10,9,6,7,4,3,5,1,2}; 
		int a[]=new int[input.length];
		int c[]=new int [a.length];
		Arrays.sort(input);
		for(int i=0;i<input.length;i++)
		{
			a[i]=input[i];
	}
		for(int i=0;i<input.length;i++)
		{
			System.out.println(a[i]);
	}
		//to copy
       // c=a.clone();
       c= Arrays.copyOf(a,5);
        for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
	}
	}

}
