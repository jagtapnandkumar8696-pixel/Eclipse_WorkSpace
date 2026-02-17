package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
    //Normal Hashmap
    HashMap hm=new HashMap();
    hm.put(1, "Test");
    hm.put("tst", 2);
    System.out.println(hm);
    
    
    //generic Hash Map 
    HashMap<String,String> hm1=new HashMap<String,String>();
    //put method use to set value for HashMap
    hm1.put("FName", "Nandkumar");
    hm1.put("LName", "Jagtap");
    hm1.put("ADDRESS", "Pune");
    hm1.put("EDUCATION", "MCS");
//if we use duplicate key then,,it will overwrite the previous value of that key with new value 
    System.out.println(hm1);
    System.out.println();
    //it return null value as is not order..if we use index to fetch element 
    System.out.println(hm1.get(0));
    System.out.println(hm1.get("FName"));
    
    
    
   Set<String> st=hm1.keySet();
   for(String s:st)
   {
	   System.out.println("Keys are -->"+s+ "Value is --> "+hm1.get(s));
   }
   
   HashMap<String,List<String>> test=new HashMap<String,List<String>>();
   List<String> l1= new ArrayList<String>();
   l1.add("abc@gmail.com");
   l1.add("asc@gmail.com");
   l1.add("tre@gmail.com");
   test.put("Email", l1);
   System.out.println(test);
	   
	}
	
	

}
