package Practice;

import java.util.Scanner;

public class Global_Variable

{
    static int age = 24;
    static String name = "Ram";
    static double salary = 6589;
    
 public static void add()
 
 {
    	
    	if (age > 20)
    	
    	{
    		System.out.println("true");
    		
    	}
    	
    	//System.out.println(name.length());
    	
    	for(int i =0; i < 4;i++) 
    		
    	{
    		System.out.println(name);
    	}
    	
    	
    }
 
 void xyz()
 
 {
	 double d = salary+4;
	 System.out.println(d);
 }
	
	
	public static void main(String[] args)
	
	
	{
		add() ;
		Global_Variable g1 = new Global_Variable();
		g1.xyz();
	}

}
