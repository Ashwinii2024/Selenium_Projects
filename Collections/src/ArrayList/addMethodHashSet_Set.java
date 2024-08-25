package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public class addMethodHashSet_Set {

	public static void main(String[] args)
	
	{
		Set s1 = new  HashSet();
		
		s1.add("ashu");
		s1.add("ashu");
		s1.add(null);
		s1.add(null);
		s1.add(21);
		System.out.println("Clear");
		System.out.println("contains");
		System.out.println(s1.contains("ashu"));
		
		
		System.out.println(s1);
		
		Set s2 = new HashSet();
		
		s2.addAll(s1);
		s2.add("nashu");
		
		
		System.out.println(s2);
		System.out.println("ContainsAll");
		System.out.println(s2.containsAll(s1));
		
		Iterator i1 = s2.iterator();
		
		while(i1.hasNext()) 
		
		{
			System.out.println(i1.next());
		}
	
		
		

	}

	
}
