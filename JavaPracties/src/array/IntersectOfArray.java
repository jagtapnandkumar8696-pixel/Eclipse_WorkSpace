package array;

public class IntersectOfArray {

	public static void main(String[] args) {
		int[]  a = {1, 2, 3, 4, 5, 6};
		int[] b = {2, 3, 4, 7, 8};
		int c[] = new int[a.length];
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])
				{
					 c[d]=a[i];
					 d++;
				}
			
		}
	}
		for(int k=0;k<d;k++)
		 {
			 System.out.println(c[k]);
		 }
	}

}
