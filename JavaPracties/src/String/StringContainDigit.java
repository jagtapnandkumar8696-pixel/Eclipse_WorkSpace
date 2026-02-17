package String;

public class StringContainDigit {

	public static void main(String[] args) {
		String str="12rt34";
		
		for(int i=0;i<str.length();i++)
		{
			if (Character.isDigit(str.charAt(i)))
			{
				int a=Integer.valueOf(str.charAt(i));
				System.out.println(a);
			}
		}

	}

}
