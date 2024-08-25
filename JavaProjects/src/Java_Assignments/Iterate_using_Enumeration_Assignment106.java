package Java_Assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Iterate_using_Enumeration_Assignment106 

{

	public static void main(String[] args) 
	
	{
		Vector v1 = new Vector();
		v1.add("Ashwini");
		v1.add(29);
		v1.add("nakshu");
		v1.add(null);
		System.out.println(v1);
		Vector v2 = new Vector();
		v2.addAll(v1);
		v2.add(23.65);
		v2.add("Yogesh");
		v2.add(0, "Pawar");
		
		System.out.println(v2);
		
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		

	}

}
