package array;

public class CheckDuplicateElement {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				
				if(arr1[i]==arr1[j] && i!=j)
				{
					System.out.println("Element is duplicate"+arr1[i]);
				}
			
		}
	}

	}
}
