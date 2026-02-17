package polymorphisom;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// all method should have same name and different signature
	
	public void Add1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	
	public void Add1(String a,int b)
	{
		
	}

	
	public int Add1(int a,String b)
	{
		return a;
		
	}
	//we can also overload main method
	public static void main(int a, int b)
	{
		
	}
	
	//varargs---It can accept any noumber of arguments
	public void test(int...a)
	{
		
	}

}
