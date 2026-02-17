package StringAndArray;

public class StringOperation2 {

	public static void main(String[] args) {
		String str="Hey baby you are lovely";
		String arry[]=str.split(" ");
		String s1="Amol";// Both Amol will point to same memory location as while creating string variable; it check in string pool whether the string with same value is present or not ;if present it not create new memory location
		String s2="Amol";
		String s3="amol";
		
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i].endsWith("y"))
			{
				System.out.println(arry[i]);
			}
		}
		
		System.out.println(s2.equalsIgnoreCase(s3));

	}

}
