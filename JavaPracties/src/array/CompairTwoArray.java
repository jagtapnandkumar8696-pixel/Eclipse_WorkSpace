package array;

import java.util.Arrays;

public class CompairTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 4, 5 };
		boolean a=true;
		if(arr1.length==arr2.length)
		{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				a=false;
				break;
			}
		}
		
		}
		else {
			a=false;
			
		}
		
		if(a)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("n equals");
		}
		//we can use equal method also
		System.out.println(arr1.equals(arr2));//it always return false
		//we can use equal method also
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("equal");
		}
	}
	
	
	

}
