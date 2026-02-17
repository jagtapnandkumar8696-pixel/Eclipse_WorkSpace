package Inheritance;

class A { 
	   int x = 20;
	  public  void m1()
	   {
		   System.out.println("Base method");
	   }
	   
	}
	 class B extends A {
	   int x = 30;
	   public  void m1()
	   {
		   System.out.println("Child method");
	   }
	  
	   
	}
	public class Inheritance1 {
	public static void main(String[] args) 
	{
	   B b = new B();
	   System.out.println(b.x); 
	 
	   A a = new A();
	   System.out.println(a.x);
	 
	   A a2 = new B();
	   System.out.println(a2.x);
	   a2.m1();
	   
	   
	  }
	
	}
	