package interfaceLearning;

 class Animal{
	 String color="Yellow";
 }
 class Dog extends Animal{
	 String color="White";
	 
	public void color()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	 
 }
public class SuperKeyWordVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.color();
        
       
	}

}
