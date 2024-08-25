package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Upcasting_Convert_Linkedlist_to_List {

	public static void main(String[] args)
	
	
	{
		// Upcasting_Convert_Linkedlist_to_List  & Treeset to set
		
		LinkedList l1=	new LinkedList();
		l1.add("ashu");
		l1.add("ashu");
		l1.add("nakshu");
		l1.add(29);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
	Iterator a1 =	l1.iterator();
	
	while(a1.hasNext()) {
		System.out.println(a1.next());
	}
	
	
ListIterator a2	= l1.listIterator();

while(a2.hasNext()) {
	
	System.out.println(a2.next());
}

while(a2.hasPrevious())
{
	
	System.out.println(a2.previous());
}
//Upcasting_Convert_Treeset_to_set
	System.out.println("Upcasting_Convert_Treeset_to_set");
	
Set s1	=	new TreeSet();

s1.add("ashu");
s1.add("ashu");
s1.add("nakshu");

System.out.println(s1);




		

	}

}
