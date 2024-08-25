package ArrayList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Iterator

{

	public static void main(String[] args) 
	
	{
		Stack s1 = new Stack();
		s1.add("nakshu");
		s1.add("Ashu");
		s1.add("Ashu");
		s1.add(null);
		s1.add(null);
		s1.add(3.14);
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		s1.push("Nakshu");
		s1.pop();
		s1.peek();
		System.out.println(s1);
		
		
		
		Enumeration e1 = s1.elements();
		
		while (e1.hasMoreElements())
			
		{
			System.out.println(e1.nextElement());
		}

	}

}
