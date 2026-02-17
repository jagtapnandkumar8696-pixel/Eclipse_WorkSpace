package Loops;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		//int i,j;
		
		int count=0;
		int array[][]=new int [3][3];
		
		
	//	int row=sc.nextInt();
	//	int col=sc.nextInt();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				array[i][j]=(int)(Math.random()*10);
			}
			 
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");
				if(array[i][j]==8)
				{    
					count++;
				}
			}
			System.out.println();
			
			 
		}
		System.out.println("Number 8 is found and repated by "+count);

	}

}
