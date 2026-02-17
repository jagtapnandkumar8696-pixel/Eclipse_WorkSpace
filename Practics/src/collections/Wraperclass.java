package collections;

public class Wraperclass {

	public static void main(String[] args) {
		int i1=10;
		//Wraping 
		Integer obj=new Integer(i1);
		System.out.println(obj);
		int i2=obj;//unwraping 
		System.out.println(i2);

	}

}
