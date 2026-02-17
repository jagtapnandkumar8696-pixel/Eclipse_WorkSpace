package array;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("before try");
		//if try block has error then aftre error statement no statment will exexcute in try block
		try
		{
			int a=10/0;
			System.out.println("In try");
			
		}
		// we can also use exception e instted of Throwable ...throwble is super class of exception
		catch(Throwable t)
		
		{//this execute if try block has error , if no error in try then this block not execute 
			
			
			System.out.println("In catch error occured");
		String s=	t.getMessage();
		System.out.println(s);
	
		}
		System.out.println("out side try");
	}

}
