package array;

import java.util.ArrayList;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nandu1");
		list.add("Nandu2");
		list.add("Nandu3");
		list.add("Nandu4");
		list.add("Nandu5");
		System.out.println(list);
		
		String str[]=new String[list.size()];
		for (int i=0;i<list.size();i++)
		{
			str[i]=list.get(i);
			
		}
		for (int i=0;i<list.size();i++)
		{
			System.out.println(str[i]);
			
		}
	}

}
