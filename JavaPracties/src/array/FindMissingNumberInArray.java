package array;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		 int[] input = {10,9,6,7,4,3,5,1,2}; 
		 
		 int lenght=input.length+1;
		 int sum1=lenght*(lenght+1)/2;
		 System.out.println(sum1);
		 int sum2=0;
		// int[]  arr1 = new int[50];
		  
		 for (int i=0;i<input.length;i++)
		 {
			 sum2=sum2+input[i];
		 }
		  
         int missingNo=sum1-sum2;
         System.out.println(missingNo);
         
	}

}
