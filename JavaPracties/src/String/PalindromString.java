package String;

public class PalindromString {

	public static void main(String[] args) {
		int count =0;
		boolean flag=true;
		String str="titit";
		char ar[]=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i]!=ar[ar.length-i-1])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("No");
		}

	}

}
