package String;

public class ReplaceChar {

	public static void main(String[] args) {
		String str= "My Name is Nandkumar Name Jagtap";
		//replace specific char
		System.out.println(str.replace("a", "b"));
		System.out.println(str);
		
		//replace first string sequence
		System.out.println(str.replaceFirst("Name", "test"));
		
		
		//replace all occurance of 
		System.out.println(str.replaceAll("Name", "test"));
		System.out.println(str.replaceAll("\\s", "#"));
	}

}
