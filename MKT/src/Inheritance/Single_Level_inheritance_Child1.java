package Inheritance;

import java.util.Scanner;

class Single_Level_inheritance_Grandparent

{
	static void GrandparentDetails() {
		
		Scanner s4 = new Scanner(System.in);
		
		
       System.out.println("Grandfather name");
    	
    	String Grandfathername = s4.next();
    	
		
	}
	
	void GrandMothername() {
		
		Scanner s5 = new Scanner(System.in);
		
		
	       System.out.println("GrandMother name");
	    	
	    	String GrandMother = s5.next();
	}
	
}

class Single_Level_inheritance_parent extends Single_Level_inheritance_Grandparent

{
	
    static void AddFathersdetails() {
    	
    	Scanner s2= new Scanner(System.in);
    	
    	System.out.println("Fathers name");
    	
    	String Fathersname = s2.next();
    	
    	
    	
    	
    	
    	
    
    	
    }
    
    void AddMothersdetails() {
    	
    	Scanner s3 = new Scanner(System.in);
    	
    	System.out.println("Mothers Name");
    	
    	String Mothersname = s3.next();
    	
    	
    }
	
}


public class Single_Level_inheritance_Child1 extends Single_Level_inheritance_parent

{
	static void addmydetails() 
	
	{
    Scanner s1 = new Scanner(System.in);
    
    System.out.println("Add childs name");
    
    String name = s1.next();
    System.out.println("Add childs age");
    
    int age = s1.nextInt();
    
    
	}
    
    
	
	public static void main(String[] args)
	
	
	{
		addmydetails();
		AddFathersdetails();
		Single_Level_inheritance_Child1 l1 = new Single_Level_inheritance_Child1();
		l1.AddMothersdetails();
		GrandparentDetails();
	
		
		l1.GrandMothername() ;
	}
	

}
