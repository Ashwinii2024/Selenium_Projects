package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Of_Iterator {

	public static void main(String[] args) 
	
	
	{

      ArrayList a1 = new ArrayList();
      
      a1.add("Ashu");
      a1.add("nakshu");
      a1.add(3.14);
      a1.add(null);
      a1.add("puja");
      System.out.println(a1);
      
  /*    Iterator i1 = a1.iterator();
        
      while(i1.hasNext()) {
    	  
    	  System.out.println(i1.next());
      }
      
*/
      
      ListIterator i2 =  a1.listIterator();
   
   while(i2.hasNext())
   
   {
	   System.out.println(i2.next());
	   
   }
   
   while(i2.hasPrevious()) {
	   
	   System.out.println(i2.previous());
   }
	}

}
