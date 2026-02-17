package javalearning;

public class Lecture8BreakeAndContinue {

	public static void main(String[] args) {

for(int i=0;i<10;i++)
{
	if(i>=5)
		continue; //break statement move control out of the loop
	System.out.println(i);
	//System.out.println("test");
}

for(int j=0;j<10;j++)
{
	if(j>=5 && j<=7)
		System.out.println(j);
		continue;
}
	}
	
}
