package javalearning;

public class Lecture5MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();
	}
	
	public static void go()
	{
		System.out.println("Go method");
		go1();
	}
	
	public static void go1()
	{
		System.out.println("Go1 method");
	}
	
	public void go2()
	{
		System.out.println("Go2 method");
	}

}
