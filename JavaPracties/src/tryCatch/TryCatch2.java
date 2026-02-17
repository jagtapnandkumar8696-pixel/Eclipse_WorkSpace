package tryCatch;

public class TryCatch2 {
	
	public int m()
	{
		try {
			return 10;
		}
		catch(Exception e)
		{
			return 20;
		}
		
		finally
		{
			
		return 30;
		}
		
		
	}

	public static void main(String[] args) {
		TryCatch2 a=new TryCatch2();
		System.out.println(a.m());

	}

}
