package String;

public class StringFunction2 {

	public static void main(String[] args) {
		String str="Nandkumar jagtap pune Saswad";
		System.out.println(str.isEmpty());//Is Empty
		System.out.println(str.codePointAt(0));
		char cr[]= {'a','h','j','r'};
		String str1="";
		String str3="Jagtap Vedika";
		//copy value from ch arry to form string 
		String str2=str1.copyValueOf(cr,1,3);
		System.out.println(str2);
		
		
		char cr1[]=new char[10];
		str3.getChars(1, 5, cr1,6);
		//1 is taring index ...5 is ending inex...cr1 is target array....6 is no of blank spces
		for (int i=0;i<cr1.length;i++)
		{
			System.out.println(cr1[i]);
		}
		String ar[]=str.split(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i].endsWith("d"));
		}
		
		
	}

}
