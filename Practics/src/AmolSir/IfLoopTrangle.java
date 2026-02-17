package AmolSir;

public class IfLoopTrangle {

	public static void main(String[] args) {
		int a=60;
		 int b=60;
    	 int c=60;
    	 
    	 
		if(a+b+c==180 && a>0 && b>0 &&c>0)
		{
			if(a!=b && b!=c && a!=c)
			{
				System.out.println("Traingle is isoscales");
				
			}
			if(a==b && b==c)
			{
				System.out.println("Equlateral tarngle");
			}
			if(a==90 || b==90||c==90)
			{
				System.out.println("Right angle tarigle");
			}
		}else
		{
			System.out.println("Not a taribgle");
		}

	}

}
