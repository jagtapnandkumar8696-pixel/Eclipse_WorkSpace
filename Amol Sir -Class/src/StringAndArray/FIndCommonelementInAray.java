package StringAndArray;

import java.util.HashSet;

public class FIndCommonelementInAray {

	public static void main(String[] args) {
		 String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
	        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	 
	        HashSet<String> set = new HashSet<String>();
	        for(int i=0;i<s1.length;i++)
	        {
	        	for(int j=0;j<s1.length;j++)
		        {
		        	if(s1[i]==s2[j])
		        	{
		        		set.add(s1[i]);
		        	}
		        }
	        }
	        System.out.println(set);

	}

}
