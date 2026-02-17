package array;

public class SeparateZeroandNonZero {

	public static void main(String[] args) {
		int[] inputArr = {0,10,43,27,0,98,75,59,191,0};
		int c=0;
		for (int i=0;i<inputArr.length;i++)
		 {
			 if(inputArr[i]!=0)
			 {
				 inputArr[c]=inputArr[i];
				 c++;
			 }
			 
			 
		 }
		
		while(c<inputArr.length)
		{
			 inputArr[c]=0;
			 c++;
		}
		for (int i=0;i<inputArr.length;i++)
		{
		  System.out.println(inputArr[i]);
		}

	}

}
