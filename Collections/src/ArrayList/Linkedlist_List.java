package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_List {

	public static void main(String[] args)
	
	
	{
		
		/*ArrayList a1 = new ArrayList();
		a1.add("Ram");
		a1.add("Ram");
		a1.add(23);
		a1.add(3.13);
		a1.add(null);
		a1.add(null);
		a1.add('C');
		a1.add("Ashwini Pawar");
	    System.out.println(a1);
	    System.out.println(a1.size());
	    System.out.println(a1.get(0));
	   // System.out.println(a1.set(1,"akshu"));
	    System.out.println(a1.contains("Ram"));
	    ArrayList a2 = new ArrayList();
	    a2.addAll(a1);
	    System.out.println(a2);
	    a2.add("Yogesh");
	    System.out.println(a2); */
	    
	    
		
		LinkedList l1 = new LinkedList();
		
		l1.add("Ram");
		l1.add("Ram");
		l1.add(23);
		l1.add(3.13);
		l1.add(null);
		l1.add(null);
		l1.add('C');
		l1.add("Ashwini Pawar");
	    System.out.println(l1);
	    System.out.println(l1.size());
	    System.out.println(l1.get(0));
	    System.out.println(l1.contains("Ram"));
	  
	  LinkedList l2 = new LinkedList();
	  
	 l2.addAll(l1);
	// System.out.println(l1);
	 l2.add("xyz");
	 l2.add(20);
	 System.out.println(l2);
	 
	Iterator I1 = l1.iterator();
	
	while(I1.hasNext())
	{
		
		System.out.println(I1.next());
	}
		
		ListIterator L2 = l1.listIterator();
		while(L2.hasNext()) {
			
			System.out.println(L2.next());
		}
		
		while(L2.hasPrevious())
		{
			System.out.println(L2.previous());
		}
		
		
	}

}
