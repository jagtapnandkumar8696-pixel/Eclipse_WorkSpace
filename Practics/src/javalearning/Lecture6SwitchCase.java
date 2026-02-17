package javalearning;

public class Lecture6SwitchCase {

	public static void main(String[] args) {
		int day=6;
		switch(day)
		{
		case 1: 
			System.out.println("Monday");
			
		case 2: 
			System.out.println("Tuesday");
			
			
		case 3: 
			System.out.println("Wednesaday");
			
			
		case 4: 
			System.out.println("Thersday");	
			
			// In switch ,after matich casing all statment get execute to avod his we can use break statement
			
		case 5: 
			System.out.println("Friday");
			System.out.println("We can use nay number of statments in one case");
			break;
			
			
		case 6: 
			System.out.println("Saturday");
			break;
			
			
		case 7: 
			System.out.println("Sunday");
			
	   
	   default :
		   
		   System.out.println("Out of value");
			
			
			
		}
		System.out.println("Sunday");
	}

}
