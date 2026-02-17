package constroctor;

public class ConstroctorwithParameters {
	int a;
	
	ConstroctorwithParameters(int a)
	{
		this.a=a;
	}
	ConstroctorwithParameters(ConstroctorwithParameters c){
		a=c.a;
		
	}
	void display() {
		System.out.println("A is "+a);
		
	}

	public static void main(String[] args) {
		
		ConstroctorwithParameters ob1=new ConstroctorwithParameters(11);
		ConstroctorwithParameters ob2= new ConstroctorwithParameters(ob1);
		ob1.display();
		ob2.display();
		
	}

}
