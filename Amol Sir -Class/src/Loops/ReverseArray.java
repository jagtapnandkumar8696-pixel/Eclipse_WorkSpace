package Loops;

public class ReverseArray {

	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6};
		String str="Test";
		char[] str1=str.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
		//revesr string
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
	}

}
