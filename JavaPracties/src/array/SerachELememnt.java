package array;

public class SerachELememnt {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int s=4;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==s)
			{
				System.out.println("element found at postion "+i);
			}
		}

	}

}
