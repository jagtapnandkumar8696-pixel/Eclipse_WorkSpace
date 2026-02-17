package array;

public class SmallestNumber {

	public static void main(String[] args) {
		 int[] input = {10,-2,6,7,4,3,5,0,2}; 
		 int small=input[0];
		 for (int i=0;i<input.length;i++)
		 {
			
			 if(small>input[i])
			 {
				 small=input[i];
			 }
		 }
		  System.out.println(small);
		  
	}

}
