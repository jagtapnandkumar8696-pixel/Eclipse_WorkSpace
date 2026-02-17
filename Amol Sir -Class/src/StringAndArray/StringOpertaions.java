package StringAndArray;

public class StringOpertaions {

	public static void main(String[] args) {
		String str="My Name is Nandkumar Jagtap";//String index also start from zero like Array
		String str2="AMOL";
		String str4="AMOL";
		String str3="Jagtap";
		System.out.println(str4+str3);
		System.out.println(str.length());
		System.out.println(str.charAt(11));
		for (int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		String str1=str.toUpperCase();
		System.out.println(str1);
		System.out.println("lower case is \n"+str.toLowerCase());
		System.out.println(str.substring(8));//Starting index is inclusive means 8th index is included
		System.out.println(str.substring(8, 15));//End index is exclusive means 15th index is exclusive

		for(int i=0;i<=3;i++)
		{
			String str5=str2.substring(i)+str2.substring(0, i);
		}
		
	}

}
