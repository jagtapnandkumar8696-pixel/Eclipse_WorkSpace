package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		/// hasset we can create normal hashset
		//HashSet  set1=new HashSet();
	//	set1.add(1);
		
		//generic hashset
		HashSet <String> set=new HashSet<String>();
		set.add("Nandkumar");
		set.add("jagtap");
		set.add("jagtap");
		set.add("Vedika");
		set.add("Pooja");
		System.out.println(set);
		
		//in ths we are useing String type instaed of Object as we created Hashset of string..we can use Object also as it is super class
		for(String st : set)
		{
			System.out.println(st);
		}
		//String is used as we assign it.next() to var which is string .if we use normal iterator it will return object which can not assign to var
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			
		{
			String var=it.next();
			if(var.equals("jagtap"))
			{
				System.out.println(var);
			}
			
		}

	}

}
