package StringAndArray;

public class Random_Number {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int) (Math.random()*100);
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
