package javalearning;

public class Lecture1 {
	
	int i=12;

	public static void main(String[] args) {

		 int i = 123;// interger value store 10 digit value
		boolean b;
		float f = 1.23f; // if f is not append ,it is consider as double
		String s = "string of character";// it is also class in java
		char c = 'a';
		long l = 123455661234556l; // it store more than 10 digit value suffix l is requried if more than 10 .if l
									// is not append it si consider as interger
		double d = 1.2344555;// it store longger value after decimal point

		Lecture1 o1; // Non premetive dtat type

		int i1; // declaration;
		int i2 = 2; // Intialaizaion

		// String is class so both steps are same
		String s1 = new String();
		s1 = "test";
		String s2 = "test";

		// String concatination
		String s3 = "test3  ";
		String s4 = "test4  ";
		String s5 = "test5  ";
		String s6 = s3 + s4 + s5;
		System.out.println(s6);
		System.out.println(s3 + s4 + s5);
		System.out.println("Test1 " + "test2" + "test3");
		int a = 10;
		int v = 5;
		System.out.println(a+v);
		System.out.println(a+v+" test");
		System.out.println("new"+a+v+" test");//in this every thing should consider as string so new105test
		System.out.println("new "+(a+v)+" test");

		
		
		//Logical Operator it return false
		System.out.println(!true);
		//relatinal operator - it  return false
		System.out.println(23==26);
		System.out.println(23!=26);
		System.out.println(23<26);
		
		//COndtional operator - it returen true if both conditionsa re true 
		System.out.println((12==13)&&(13==13));
	}

}
