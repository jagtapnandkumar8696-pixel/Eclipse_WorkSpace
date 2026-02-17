package Loops;

public class Whileloop_Fibonace {

	public static void main(String[] args) {
	int firstterm=0;
	int secondterm=1;
	int n=0;
    int count=10;
    while(n<count)
    {
    	System.out.print(firstterm+",");
    	int thirdterm=firstterm+secondterm;
    	firstterm=secondterm;
    	secondterm=thirdterm;
    	n++;
    }
   

	}

}
