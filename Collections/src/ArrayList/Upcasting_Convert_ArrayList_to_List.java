package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Upcasting_Convert_ArrayList_to_List 


{

	public static void main(String[] args) 
	
	//List is parent class
	//ArrayList is child class
	{
	       //Upcasting  
		System.out.println("Understanding List");
       List l1	=	new ArrayList();
       l1.add("Ram");
       l1.add("Rani");
       l1.add("Raju");
       l1.add("ashu");
       l1.add("ashu");
       l1.add(29);
       l1.add(3.14);
       l1.add(null);
       l1.add(null);
       System.out.println(l1);
       
       System.out.println("Understanding set");
       
   Set s1 = new HashSet();
   
   s1.add("Ram");
   s1.add("Rani");
   s1.add("Raju");
   s1.add("ashu");
   s1.add("ashu");
   s1.add(29);
   s1.add(3.14);
   s1.add(null);
   s1.add(null);
 
   System.out.println(s1);
       
       //Iterator interface
   
       Iterator i1 =  l1.iterator();
 
       
    while(i1.hasNext())
       
       {
    	   
    	   System.out.println(i1.next());
        	   
          }
    
   Iterator i2 = s1.iterator();
   
   while(i2.hasNext())
   {
	   
	   System.out.println(i2.next());
       }
   
   ListIterator i3 =  l1.listIterator();
   
   
   while(i3.hasNext())
      
      {
   	   
   	   System.out.println(i3.next());
       	   
         }
   
   while(i3.hasPrevious()) {
	   System.out.println(i3.previous());
   }
   
	}

}
