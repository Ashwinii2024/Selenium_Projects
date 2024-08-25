package Kt;

import java.util.Arrays;

public class Stringex {

	public static void main(String[] args) 
	
	{
		
		String name ="Ashwini123@gmail.com";
		
	    System.out.println(name.length());
	    
	   String s1 = "tom";
	   System.out.println(s1.matches("..."));
	    
	   System.out.println(s1.matches("t(.*)"));
	   
	  System.out.println(s1.matches("(.*)m"));
	  
	  System.out.println(s1.matches("(.*)o(.*)"));
	  
	System.out.println( name.replaceAll("[A-Z]", "ghs"));
	
	System.out.println(name.replaceAll("[0-9]", ""));
	System.out.println(name.replaceAll("Ashwini", "Shilpi"));
	
     System.out.println(name.isEmpty());
     System.out.println(name.contains("Ashwini"));
     
   System.out.println(name.lastIndexOf('c'));
   System.out.println(name.lastIndexOf('o'));
   
   
   System.out.println(name.substring(3,10));


	  
	  
		}

}
