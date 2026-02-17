package StringAndArray;

public class Stringimutabble {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.concat("world"));
		System.out.println(str);
		String str1 = "hello ";
		str1 = str1 + "world";
		System.out.println(str1);

	}

}
