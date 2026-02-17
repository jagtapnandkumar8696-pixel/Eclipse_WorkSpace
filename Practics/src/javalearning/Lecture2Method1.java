package javalearning;

public class Lecture2Method1 {
	
	 int i=5; // it is instance/global variable ..declare in class level..we can use it anywhre in class	
	
	
	//declare method
	public int display()
	{
		//method defination here
		
		int i=2; //it is local variable declare at method level..we can not used it outside the method
		
		return 10;
		
	}
	
	

	public static void main(String[] args) {
		//we are creating object of class Lecture 1 and printing value of instance varible of that class
		Lecture1 l1=new Lecture1();
		Lecture2Method1 l2=new Lecture2Method1();
		System.out.println(l1.i);
		System.out.println(l2.i);
	}

}
