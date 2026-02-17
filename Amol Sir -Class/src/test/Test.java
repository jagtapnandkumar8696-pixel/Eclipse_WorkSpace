package test;

public class Test {

	public static void main(String[] args) {
		int flag=1;
		int p=16;
		int m=p/2;
		if(p==0 || p==1)
		{
			System.out.println("No");
		}
		for(int i=2;i<=m;i++)
		{
			if(p%i==0)
			{
				flag=0;
			}
		}
		if (flag==0)
		{
			System.out.println("no");
		}
		}

	
	}


