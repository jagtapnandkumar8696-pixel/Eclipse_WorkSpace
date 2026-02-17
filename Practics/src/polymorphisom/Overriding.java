package polymorphisom;

public class Overriding {
	//return type should be same if return type is premetive
	public double homelone()
	{
		return 8.5;
	}
	
	//if method return object then return type should be class name 
	//in this case of overiding return types are different ..thye are class names
  public Overriding carloan()
  {
	  Overriding ol=new Overriding();
	  return ol;
  }
  
}
