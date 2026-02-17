package StringAndArray;

public class SecondsmallElementInArray {

	public static void main(String[] args) {
		int temp;
int a[]=new int[10];
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
			
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
		System.out.println(a[1]);
		
	}

}
