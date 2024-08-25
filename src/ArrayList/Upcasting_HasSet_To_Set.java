package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Upcasting_HasSet_To_Set 

{

	public static void main(String[] args)
	
	{
		Set s1 = new HashSet();
		
		s1.add("Ashu");
		s1.add(29);
		s1.add("nakshu");
		s1.add("Ashu");
		System.out.println(s1);
		
		Set s2 = new HashSet();
		s2.addAll(s1);
		System.out.println(s2);
		s2.add("ram");

		
		System.out.println(s2);
		System.out.println(s2.isEmpty());
	//	System.out.println(s2.removeAll(s2));
		System.out.println("contains");
		s2.contains("r am");
		System.out.println(s2);
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
			
	}

}
