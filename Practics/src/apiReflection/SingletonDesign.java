package apiReflection;

public class SingletonDesign {
	
	private static SingletonDesign instance=new SingletonDesign();
	
	private SingletonDesign()
	{
		System.out.println("Creating constroctor");
		
	}
	public static SingletonDesign getInstance()
	{
		return instance;
		
	}
	

}
