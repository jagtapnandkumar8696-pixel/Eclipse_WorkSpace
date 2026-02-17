package array;

public class FinnalyBlock {

	public static void main(String[] args) {

try
{
	int i=10/0;
}

catch(Throwable t) // always use throwable as it is super class of error and exception ..if use error it can not catch exception and if use exception it can not catch error 
{
	System.out.println("error catched");
}
finally 
{
	System.out.println("Finally get execute every time ");
}

	}

}
