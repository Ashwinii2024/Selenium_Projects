package ArrayList;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Iterator {

	public static void main(String[] args)
	
	
	{
		
		Vector v1 = new Vector();
		
		v1.add("ashu");
		v1.add("ram");
		v1.add("shyam");
		v1.add(9);
		System.out.println("Contains");
		System.out.println(v1.capacity());
		System.out.println("<---AddElement--->");
		v1.addElement("Shambhu");
		System.out.println(v1);
		System.out.println("<---FirstElement-->");
		System.out.println(v1.firstElement());
		System.out.println("<---LastElement-->");
		System.out.println(v1.lastElement());
		System.out.println("<---Remove Element--->");
		System.out.println(v1.remove(1));
		System.out.println("<----Remove Element at given index--->");
		System.out.println(v1.removeElement("ram"));
		//System.out.println(v1.removeAll(v1));
		
		System.out.println("<---Iterator---->");
	Iterator i1=	v1.iterator();
	
	while(i1.hasNext())
	
	
	{
		
		System.out.println(i1.next());
	}

	}

}
