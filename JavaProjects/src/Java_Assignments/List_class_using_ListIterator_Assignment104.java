package Java_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_class_using_ListIterator_Assignment104 

{

	public static void main(String[] args) 
	
	{
		 List a1 = new ArrayList();
	      
	      a1.add("ashu");
	      a1.add("nakshu");
	    //  a1.add(3.14);
	     // a1.add(null);
	      a1.add("puja");
	      System.out.println(a1);
	      ListIterator i2 =  a1.listIterator();
	      
	    
	      while(i2.hasPrevious()) {
	    	  System.out.println(i2.previous());
	      }
	   	
	}

}
