package Kt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Upcasting_Array_list_to_List

{

	public static void main(String[] args)
	
	{
      List l1 = new ArrayList();
      l1.add("ashu");
      l1.add("nakshu");
      l1.add("ashu");
      l1.add(3.14);
      System.out.println(l1);
      
      Iterator i1 = l1.iterator();
      
      while(i1.hasNext())
    	  
      {
    	  System.out.println(i1.next());
      }
      


	}

}
