package Loops;

public class TriangleUsingIfLoop {

	public static void main(String[] args) {
		int a=45;
		int b=45;
		int c=90;
		if(a+b+c==180 && a>=1 && b>=1 && c>=1)
		{
		if(a==b && b==c)
		{
			System.out.println("Triangle is equlateral traiangle");
		}
		else if(a!=b && b!=c && c!=a)
		{
			System.out.println("Triangle is isoscales Trinagle");
			
		}
		else if (a==90 || b==90 || c==90)
		{
			System.out.println("Triabgle is Right angle traingle");
		}
		
		}
		else
		{
			System.out.println("Not a traigle");
		}
	}

}
