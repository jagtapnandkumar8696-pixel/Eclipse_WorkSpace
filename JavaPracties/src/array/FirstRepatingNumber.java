package array;

import java.util.HashSet;

public class FirstRepatingNumber {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,7,4,9};
		int a=-1;
		
		HashSet hs=new HashSet();
		for (int i=0;i<arr.length;i++)
		{
			if (hs.contains(arr[i]))
			{
				a=i;
			}
			else
			{
				hs.add(arr[i]);
			}
			
		}
		System.out.println("repating number is at"+arr[a]);
	

	}

}
