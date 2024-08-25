package Kt;

public class String_Methodes {

	public static void main(String[] args) 
	
	{
		String s1 = "My123 Name is Ashwini Pawar";
		
		System.out.println((s1.length()));                    //return type is int , parameter string value

		
		System.out.println((s1.toUpperCase()));               //return type is String , parameter string value 
		
		System.out.println((s1.toLowerCase()));              //return type is String , parameter string value 
		
		System.out.println(s1.indexOf('i'));                  //return type is int , parameter char value
		
		System.out.println(s1.charAt(4));                   //return type is char value , parameter int value
		
		System.out.println(s1.trim());                        //return type is String , parameter string value 
		
		System.out.println(s1.contains(" Name is "));         //return type is boolean parameter is string value
		
		String s2 = "my name is ashwini pawar";          
		 
		System.out.println(s1.equals(s2));                       //return type is boolean, parameter is String (object an object)
		
	    System.out.println(s1.equalsIgnoreCase(s2)); 
	    //return type is boolean, parameter is String (object an object)
	    System.out.println("<--Substring statrt index-->");
	    
	   System.out.println(s1.substring(9));                       //return type is string, parameter is int value
	   
       System.out.println(s1.substring(2, 9));                     //return type is string, parameter is int value
       
       System.out.println(s1.replace('i', 'N'));                        //return type is string, parameter is String value 
      
      System.out.println(s1.isEmpty());                                //return type is string, parameter is boolean value
      String s3 = "xyz";   
      System.out.println(s3.isBlank());                                //return type is string, parameter is boolean value
      
      
      System.out.println(s1.replaceAll("Paw", "z"));                  //return type is string, parameter is string value
      
     System.out.println(s1.replaceAll("[a-z]", " "));                  //return type is string, parameter is string value
     
   System.out.println(s1.replaceAll("[0-9]", " "));
   
 System.out.println(s1.replaceAll(" ", ""));
 
 System.out.println(s1.matches("(.*)r"));                       //return type is boolean parameter is String regex
 
 System.out.println(s1.matches("M(.*)"));
 
 System.out.println(s1.matches("(.*)y(.*)"));       
     
 String a2 ="ashu";
System.out.println(a2.matches("...."));
     
    
    
	     
	    
	
	
	}

}
