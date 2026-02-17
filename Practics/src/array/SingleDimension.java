package array;

public class SingleDimension {

	public static void main(String[] args) {
		int array[]=new int[5];
		System.out.println(array.length);
		/*
		array[0]=1;
		array[1]=2;
		array[4]=3;
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
		
		}
		*/
		for(int i=0 ;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*1000);
			System.out.println(array[i]);
		}
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}

}
