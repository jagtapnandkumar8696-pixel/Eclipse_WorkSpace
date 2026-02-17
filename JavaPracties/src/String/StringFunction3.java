package String;

public class StringFunction3 {

	public static void main(String[] args) {
	String str="       Vedika Jagtap";
	String str2="Nandkumar Jagtap";
	//return has code
	System.out.println(str.hashCode());
    System.out.println(str2=str);
    //return index of first occurnace of mention charcter 
    System.out.println(str.indexOf('k'));
    //return index of last occurnace of mention charcter 
    System.out.println(str.indexOf('k'));
    //last index excluded
    System.out.println(str.substring(0,5));
    //removeblank spce from starting 
    System.out.println(str.trim());
  
	}

}
