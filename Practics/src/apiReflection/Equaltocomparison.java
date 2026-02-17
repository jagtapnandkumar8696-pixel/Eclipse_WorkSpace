package apiReflection;

public class Equaltocomparison {

	public static void main(String[] args) {
		String s1="Test";
		String s2="Test";
		//Print True for both
		System.out.println(s1==s2);
		System.out.println(s1.equals(s1));
		//Print true for Equal and false for ==
		String a1=new String("Test");
		String a2=new String("Test");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a1));
		System.out.println();
		SingletonDesign s3=SingletonDesign.getInstance();
		SingletonDesign s4=SingletonDesign.getInstance();
		
		System.out.println(s4==s3);
		System.out.println(s3.equals(s4));
	}

}
