package interfaceLearning;

 class Bird{
	 public void eat()
	 {
		 System.out.println("Eating..");
	 }
 }
 class Duck extends Bird{
	
	 
	public void eat()
	{
		System.out.println("Eating fish..");
		
	}
	public void  fly()
	{
		eat();  //child called its own method if having same name as parent method
		super.eat();
	}
	 
 }
public class SuperKeyWordMethod {

	public static void main(String[] args) {
		Duck d=new Duck();
		d.fly();
		
        
       
	}

}
