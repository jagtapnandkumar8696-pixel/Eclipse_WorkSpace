package classNadAccessModifier;

public class Class1 {
	int a;
	String s;
	static char ch;
 void display()
 {   a=12;
	 System.out.println("A is "+a);
	
	 System.out.println("S is "+s);
 }
	public static void main(String[] args) {
		
		Class1 c=new Class1();
		c.a=3;
		c.s="V";
		ch='t';
		c.display();
				
		Class1 c1=new Class1();
		
		c1.a=8;
        c1.display();
	}

}
