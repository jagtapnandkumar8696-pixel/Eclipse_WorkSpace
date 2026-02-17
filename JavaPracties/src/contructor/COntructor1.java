package contructor;

public class COntructor1 {
	int a=6;
	String str;
	COntructor1()
	{
		System.out.println(a+"  "+str);
		
	}
	
	COntructor1(int b,String str1)
	{
		a=b;
		String str=str1;
		//this.str=str1;
		System.out.println(a+"  "+str);
		
	}
	COntructor1(COntructor1 c)
	{
		this.a=c.a;
		this.str=c.str;
		System.out.println(a+"  "+str);
	}
	public static void main(String[] args) {
		COntructor1 c=new COntructor1();
		COntructor1 c1=new COntructor1(1,"Test");
		COntructor1 c2=new COntructor1(c1);
		COntructor1 c3=c1;//we are assigning refrenace so....c3 contain data in c
		System.out.println(c3.a);
		System.out.println(c3.str);

	}

}
