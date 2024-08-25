package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Program {

	public static void main(String[] args) 
	
	{
		ArrayList a1 = new ArrayList();
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Sita");
		a1.add('V');
		a1.add(29);
		System.out.println(a1);
		
		 Iterator i1 = a1.iterator();
		 
		 while(i1.hasNext()) 
		 
		 {
			 System.out.println(i1.next());
			 
		 }

	}

}
