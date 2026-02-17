package array;

public class TwodimensionalArray {

	public static void main(String[] args) {
		
		int array[][]=new int [2][3];
           array[0][0]=5;
           array[0][1]=6;
           array[0][2]=7;
           array[1][0]=8;
           array[1][1]=9;
           array[1][2]=10;
           
           
        		   System.out.println(array[1][0]);
        		   //it return first array length
        		   System.out.println(array.length);
        		   //second array length
        		   System.out.println(array[0].length);
        		   //second array length
        		   System.out.println(array[1].length);
        		   for(int i=0;i<array.length;i++)
        			   
        		   {
        			   for(int j=0;j<array[0].length;j++)   
        			   {
        				   
        				   System.out.print(array[i][j]+"  ");
        			   }
        			   
        			   System.out.println();
        		   }
        		 

}

}