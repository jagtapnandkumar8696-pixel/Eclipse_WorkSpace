package AmolSir;

public class ReversArray {

	public static void main(String[] args) {
	
		int b[]=new int[10];
		for (int i=0;i<b.length;i++)
		{
			b[i]=(int)(Math.random()*100);
			
			int c=b[i];
			if(c%2==0)
			{
				System.out.println("Number"+" "+b[i]+" "+"is  Even");
			}
			else {
				System.out.println("Number"+" "+b[i]+" "+"is  odd");
			}
		}
		System.out.println();

	}

}
