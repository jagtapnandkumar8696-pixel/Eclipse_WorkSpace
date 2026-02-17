package StringAndArray;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "My Name is Nandkumar Jagtap";
		String array[]=str.split(" ");
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i].endsWith("r"));
			System.out.println(array[i].startsWith("M"));
			System.out.println(array[i].concat("nan"));
			System.out.println(array[i].contains("r"));
		}

	}

}
