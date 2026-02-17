package collections;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		System.out.println(list.size());
		
		//adding to list
		list.add(10);
		list.add("Nandkmar");
		list.add(null);
		list.add('c');
		list.add("Nandkmar");
		list.add(true);
		System.out.println(list);
		System.out.println();
		
		
		
		//fetching from list
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		list.remove(0);
		System.out.println();
		
		for(Object i : list)
		{
			System.out.println(i);
		}
		
		java.util.Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		
		}
		
		
		//generic ArrayList here we can add only intergers
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		
		//as generic array list we can directly assign object to integer
		int i=list1.get(0);
		System.out.println(i);

	}

}
