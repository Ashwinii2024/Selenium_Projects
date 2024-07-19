package mainmethod;

public class String_Function {
	
	public static void main(String[] args) 
	
{
		// count length
		String name = "Manish";                  //length
		//int count = name.length();
		System.out.println("<-------COUNT OF MANISH------>");
		System.out.println(name.length());
		
		// count length
		String name1 = "School name is vidya";
		System.out.println("<-------LENGTH OF MANISH------>");
		System.out.println(name1.length());
		
		//LowerCase &toUpperCase 
		System.out.println("<-------toLowerCase------>");
		System.out.println(name1.toLowerCase());
		
		System.out.println("<-------toUpperCase------>");
		System.out.println(name1.toUpperCase());
		
		//LowerCase &toUpperCase
		String batch_name = "Ab43bymkt";
		System.out.println("<-------toLowerCase------>");
		System.out.println(batch_name.toLowerCase());
		System.out.println("<-------toUpperCase------>");
		System.out.println(batch_name.toUpperCase());
		
		//charAt in which alphabet
		System.out.println("<-------charAt ------>");
		System.out.println(batch_name.charAt(7));
		
		//indexOf() on which number the 'm' is assign
		System.out.println("<-------indexOf() ------>");
		System.out.println(batch_name.indexOf('m'));
		
		//trim() function
		System.out.println("<-------trim() ------>");
		String name3 = "  Ashwini  Pawar  ";
		System.out.println(name3.trim());
		
		String name4 = "        Ashwini  Pawar";
		System.out.println("<-------trim() ------>");
		System.out.println(name4);
		
		System.out.println(name4.trim());
		
		//equals function()
		String batch_name1 = "Ab43bymkt";
		System.out.println("<-------equals function() ------>");
		System.out.println(batch_name.equals(batch_name1));
		
		String Student_name = "Ashwini";
		String Student_name_1 = "Anusha";
		
	    System.out.println(Student_name.equals(Student_name_1));
		System.out.println("<-------equals function() ------>");
		
	    //equalsIgnoreCase
	    String myname = "Ashwini";
	    String myname1 = "ashwinI";
		System.out.println("<-------equalsIgnoreCase function() ------>");
	    System.out.println(myname.equalsIgnoreCase(myname1));
	    
	    //contains functions
	    System.out.println("<-------contains function() ------>");
	    System.out.println(name.contains("vidya"));
	    
	    //substring(start index)
	    System.out.println("<-------substring(start index) ------>");
		  
	    System.out.println(name.substring(2));
	    
	    System.out.println(myname.substring(3));
	    
	
	    
	   
	    System.out.println(name1.subSequence(0, 5));
	    
	    //name is vidya out
	    
	   // String name1 = "School name is vidya";
	    
	    System.out.println(name1.subSequence(6, 11));
	    System.out.println(name1.subSequence(12, 14));
	    System.out.println(name1.subSequence(15, 20));
	    
	    
	    //isempty()
	    System.out.println("<-------esempty() ------>");
	    System.out.println(Student_name.isEmpty());
	    
	    
	    //lastendexof()
	    System.out.println("<-------lastendexof() ------>");
	    
	    //String name1 = "School name is vidya";
	    System.out.println(Student_name.lastIndexOf("a"));
	  //  String name = "Manish"; 
	    
	    //lastIndexOf a
	    System.out.println("<-------lastendexof() a ------>");
	    System.out.println(name.lastIndexOf("a"));
	    
	    String FullName = "ashwini  Pawar";
	    
	    //replace
	    System.out.println("<-------replace()------>");
	    System.out.println(FullName.replace('a', 'z'));
	    
	  //  replaceAll space from both string
	    System.out.println("<-------replace space from both string()------>");
	    System.out.println(FullName.replaceAll(" ", ""));
	    
	    //remove the numeric value using replace
	 
	    String SchoolName = "jtmchool123";
	    System.out.println("<------remove the numeric value using replace()------>");
	    System.out.println(SchoolName.replaceAll("[0-9]",  " "));
	    
	    //replace ashwini with pawar
	    System.out.println("<------replace ashwini with pawar------>");
	    
	    System.out.println( FullName.replaceAll("ashwini", "Pawar"));
	    
	    //replace aplhabets
	    
	    System.out.println("<------replace aplhabets------>");
	    System.out.println(SchoolName.replaceAll("[a-z]", ""));
	    
	    
	    String CollegeName = "JTM123456";
	    System.out.println("<------replace aplhabets------>");
	    
	    System.out.println(CollegeName.replaceAll("[A-Z]", ""));
	    
	    //check given string ends with i
	    
	    String n1 ="Manish Kumar Tiwari";
	    System.out.println("<------check given string ends with i------>");
	    System.out.println(n1.matches("(.*)i"));
	    
	  //check given string starts with m
	    System.out.println("<------check given string starts with M----->");
	    System.out.println(n1.matches("M(.*)"));
	    
	    //check k is present or not
	    System.out.println("<------check k is present or not---->");
	    System.out.println(n1.matches("M(.*)"));
	    System.out.println(n1.matches("(.*)K(.*)"));
	    
	 //check the single character search
	    
	    String a3 ="tom";
	    System.out.println("<-----check the single character searcht---->");
	  System.out.println(a3.matches("..."));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
