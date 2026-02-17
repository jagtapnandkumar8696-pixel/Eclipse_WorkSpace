package constructor;

public class ContructorTest {
	
	 int roll_No;
	public  String name;

	public static void main(String[] args) {
		// new ContructorTest(12,"jitu");
ContructorTest c1= new ContructorTest(12,"test");


System.out.println("name is "+c1.name);
System.out.println("Roll o is "+c1.roll_No);
//new ContructorTest(10);
//new ContructorTest(12);
//new ContructorTest(11,"Nandu");
//System.out.println("name is "+c1.name);
//System.out.println("Roll o is "+c1.roll_No);


	}
	
	//contructor 1 with parameter
	public ContructorTest(int roll_no,String name)
	{
		// To calling contructor this() can be used..and this() must be first statment in contructor
		this("t");
		this.name=name;
		this.roll_No=roll_no;
		System.out.println("value of name ="+name);
		System.out.println("value of name ="+roll_No);
	
		
		
	}
	public ContructorTest(String t)
	{
		System.out.println("Normal Contriuctor");
		
	}
	
	public ContructorTest(int i)
	{
		System.out.println("Vlaue of i"+i);
	}
	public ContructorTest()
	{
		System.out.println("No Parameter constructor");
	}

}
