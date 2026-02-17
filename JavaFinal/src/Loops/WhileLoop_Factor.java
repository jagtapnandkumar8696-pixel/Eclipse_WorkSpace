package Loops;

public class WhileLoop_Factor {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		while(n>=1)
		{
			fact=n*fact;
			n--;
		}
System.out.println(fact);
	}

}
