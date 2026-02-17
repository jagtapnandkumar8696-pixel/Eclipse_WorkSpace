package array;

public class InsertElementInArray {
	public static void main(String[] args) {
		int ar=5;
		int[] arr = new int[ar+1];
		int p=3;
		int k=13;
		for(int i=0;i<ar;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<ar;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=ar-1;i>=p-1;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[p-1]=k;
		System.out.println();
		
		for(int i=0;i<=ar;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
