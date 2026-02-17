package JavaArray;

public class Find_LargestEle_In_Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int large=0;
		for(int i= 0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.print(" "+a[i]);
		}
         large=a[0];
         for(int i= 0;i<a.length;i++)
 		{
 			if(large<a[i])
 			{
 				large=a[i];
 			}
 		}
          System.out.println();
        	System.out.println("larger is " +large);
        
	}

}
