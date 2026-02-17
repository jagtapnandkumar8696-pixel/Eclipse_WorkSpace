package constroctor;

import classNadAccessModifier.Class1;
class Constroctor {
 public int b;
	
}
public class Constroctor1{

	int a=12;
	int c;
	
	String s;
	static char ch;
	 Constroctor1()
	{display();
		a=101;
		s="Nandu";
		System.out.println("Test");
		
	}
 void display()
 {  // a=12;
	 System.out.println("A is "+a);
	
	 System.out.println("S is "+s);
	 

 }
	public static void main(String[] args) {
		
		Constroctor1 c=new Constroctor1();
		
		
	
		
		c.a=8;
		c.display();
		new Constroctor1().display();
				
		
	}


}
