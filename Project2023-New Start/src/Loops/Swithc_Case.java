package Loops;

public class Swithc_Case {

	public static void main(String[] args) {
		
		int a=12,b=2,c;
		String operation="2";
		
		switch(operation)

		{
			case "add" : c=a+b;
			System.out.println("Addtion is " +c);
			break;
			
			case "sub" : c=a-b;
			System.out.println("Subtractions is " +c);
			break;
			
			default :
				System.out.println("Out of option");
			
			case "div" : c=a/b;
			System.out.println("Division is " +c);
			//break;
			
		
			
			case "mul" : c=a*b;
			System.out.println("Multiplication is " +c);
			break;
			
			
		}
	}

}
