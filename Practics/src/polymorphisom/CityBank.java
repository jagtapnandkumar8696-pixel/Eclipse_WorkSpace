package polymorphisom;

public class CityBank extends Overriding {

	public static void main(String[] args) {
      
		Overloading o=new Overloading();
		o.Add1(1, 2);
				

		    CityBank b=new CityBank();
		    
		    //here it will call self homelond method not parent class method
		   System.out.println(b.homelone()); 
             
	}
	
	public double homelone()
	{
		return 10.5;
	}
	 public CityBank carloan()
	  {
		  CityBank ol=new CityBank();
		  return ol;
	  }
	


}
