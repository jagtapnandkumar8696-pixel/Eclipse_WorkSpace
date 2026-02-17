package Loops;

public class NewTraingle2 {

	public static void main(String[] args) 
		{    
			//i for rows and j for columns      
			//row denotes the number of rows you want to print  
			int i, j,k, row = 6;  
			
			for (i=0;i<row;i++)
			{
				for (j=2*(row-i);j>=0;j--)
				{
					
					System.out.print(" ");
					
				}
				for(j=0;j<=i;j++)
				{
					
					System.out.print("* ");
				}
				System.out.println();
				
			}
			for(i=7;i>=0;i--)
			{
				for(j=7;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(k=0;k<=i;k++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
			
			
			}   

}
