package interfaceLearning;
 class Parent
{   
	 int a;
	 Parent()
	{
		System.out.println("Parent contructor");
	}
}
 
 class child extends Parent{
	 
	  child()
		{   super();
			System.out.println("child contructor");
		} 
 }
public class SuperKeywordConstructor {

	public static void main(String[] args) {
		child c=new child();

	}

}
