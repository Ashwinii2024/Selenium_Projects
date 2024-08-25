package ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Upcasting_Vector_List {

	public static void main(String[] args) 
	
	{

       List l1 = new Vector();
       
       l1.add("Ashu");
       l1.add("ashu");
       l1.add(null);
       l1.add(3.14);
       l1.add(true);
       System.out.println(l1);
       
       List l2 = new Vector();
       l2.addAll(l1);
       System.out.println(l2);
       l2.add("nakshu");
       l2.add("Ram");
       System.out.println(l2);
       l2.set(1, "Raju");
      System.out.println(l2);
      System.out.println(l2.contains("Ram"));
       System.out.println(l2.subList(1, 4));
    
     Iterator i1 = l2.iterator();
     
     while(i1.hasNext())
    	 
     {
    	 System.out.println(i1.next());
    	 
     }
      



	}

}
