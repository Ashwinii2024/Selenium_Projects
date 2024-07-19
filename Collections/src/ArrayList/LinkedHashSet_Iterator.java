package ArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Iterator {

	public static void main(String[] args)
	
	
	{
		LinkedHashSet l1 = new LinkedHashSet();
		
		l1.add("Ashwini");
		l1.add(23);
		l1.add("nakshu");
		l1.add('v');
		l1.add(null);
		
		System.out.println(l1);
		
	Iterator i1 =	l1.iterator();	
	
	while (i1.hasNext())
		
	{
		System.out.println(i1.next());
	}

	}

}
