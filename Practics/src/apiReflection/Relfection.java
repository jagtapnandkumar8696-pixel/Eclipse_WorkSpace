package apiReflection;

import java.lang.reflect.Method;

public class Relfection {

	public static void main(String[] args) {
		
		Test t=new Test();
		//class is class
		
		Class cls=t.getClass();
		System.out.println(cls);
		
		//Method is also class 
		//getdeclare method returns aray of methods
		Method m[]=cls.getDeclaredMethods();
		for(Method a : m)
		{
			System.out.println(a.getName() +"    Return Type is "  +a.getReturnType()+"Argument is "+a.getGenericReturnType());
		}

	}

}
