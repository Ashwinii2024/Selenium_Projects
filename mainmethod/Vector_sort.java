package mainmethod;

import java.util.Collections;
import java.util.Vector;

public class Vector_sort {

	public static void main(String[] args)
	
	{
		Vector v1 = new Vector();
		
		v1.add('s');
		v1.add('l');
		v1.add('n');
		v1.add('x');
		
		v1.add('a');
		Collections.sort(v1);
		System.out.println(v1);

	}

}
