package StringAndArray;

public class PalindromString {

	public static void main(String[] args) {
		String str="tat";
		int flag=0;
		char ar[]=str.toCharArray();
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]!=ar[ar.length-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("No Palindrom");
		}

	}

}
