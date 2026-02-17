package javalearning;

public class MainClassToCall {

	public static void main(String[] args) {
		
		//calculator..Method returing interger
		//addtion
		Lecture3Calculator l1=new Lecture3Calculator();
				int sum=l1.add(1, 2);
				
		//minus
				System.out.println(l1.minus(5, 3));
				
				//Predifine Methods
				double d=Math.random()*10;
				System.out.println(d);
				
				//Type casting convert double to int 
				int i=(int) (Math.random()*10);
				System.out.println(i);

	}

}
;