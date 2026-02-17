package superkeyward;

public class Dog extends Animal{
	
	public Dog(int i)
	{
		super("test"); 
		super.sound();
	System.out.println("Dog Sound");	
	
	}
	
	
	public Dog(String t)
	
	{
		super("test");
		System.out.println("Constructor calling ");
	}
	
 public void sound()
 {// use super.Methodname() to call superclass methods 
	 super.sound();
	  System.out.println("Super key use dog class ");
 }

}
