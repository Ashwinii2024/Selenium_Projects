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
		System.out.println(v1);
		
	Iterator i1=	v1.iterator();
	
	while(i1.hasNext())
	
	
	{
		
		System.out.println(i1.next());
	}

	}

}
