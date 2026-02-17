package interfaceLearning.Overloading;

public class OverloddedMethod {
	int a=5;
    int b=6;
public void addtion()
{
	int c=a+b;
	System.out.println("Value of C with out arg method"+" "+c);
}
public void addtion(int x)
{
	a=x;
	int c=a+b+x;
	System.out.println("Value of C for single org Method"+c );
			
}
	public static void main(String[] args) {
		OverloddedMethod m=new OverloddedMethod();
		m.addtion();
		m.addtion(2);
		

	}

}
