package javalearning;

public class Lecture6IfElse {

	public static void main(String[] args) {
	int i=(int)(Math.random()*20);
if(i>10)

	System.out.println(i+" " + "gretar than 10");
else if(i<10 && i>5)
	System.out.println(i+" " + "is between 10 and 5");
else
	System.out.println(i+" " + "less than 10");

	}

}
