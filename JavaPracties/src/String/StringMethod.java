package String;

public class StringMethod {

	public static void main(String[] args) {
		String str="testing";
		String str1="testing";
		String str4="";
		
		//it return no off characters between given range with last index excluded 
		System.out.println(str.codePointCount(0, 2));
		//It compair two string using unicode and return diifernce between unicode...if first string is large it return positive value
		System.out.println(str.compareTo(str1));
		//return true or false..if exac tsub string is found return true
		System.out.println(str.contains("ting"));
		//return true or false..both string are exact same it return true
		System.out.println(str.contentEquals("Testing"));
		//return true or false..both string are exact same it return true
		System.out.println(str.matches("testing"));
		//return substring started from mentioned index
		String str2=str.substring(1);
	
		System.out.println(str2);
		//return substring started from mentioned index to mentioned index with last charcter excluded
		CharSequence cs=str1.subSequence(1, 4);
		System.out.println(cs);
		System.out.println(str2.toString());
		System.out.println(str4.valueOf(str2));
		
		
		String str5 = "1254";
		 
		 int number = 7895;
		 
		 // convert string to int using Integer.parseInt() method
		 int parseIntResult1 = Integer.parseInt(str5);
		 
		 // convert string to int using Integer.valueOf() method
		 int valueOfResult1 = Integer.valueOf(str5);
		 System.out.println(parseIntResult1);
		 System.out.println(valueOfResult1);
		 
		 String str6="Abcabcabc";
		 
		String str7=str6.replaceAll("b", "xyz");
		System.out.println(str7);
	}

}
