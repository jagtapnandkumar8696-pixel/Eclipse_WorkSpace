package Inheritance;

class Test
{
	public  void show()
	{
		System.out.println("Base ");
	}
}

class Test2 extends Test
{
	public  void show()
	{
		System.out.println("child");
	}
}

public class Inheritance3 {
	
	public static void print (Test a)
	{
		a.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test t1=new Test2();
		Test2 t2=new Test2();
		print(t);
		print(t1);
		print(t2);

	}

}
