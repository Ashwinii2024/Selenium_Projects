package Inheritance;

class Father

{
	static void home() 
	
	{
		System.out.println("Father have home");
		
	}
	
	static void car() {
		System.out.println("Father have car");
	}
}


public class Single_level_Inheritance_child extends Father

{
	static void laptop() 
	
	{
		System.out.println("child have laptop");
	}
	
	static void bike()
	{
		System.out.println("child have bike");
	}
	
	

	public static void main(String[] args) 
	
	{
		laptop();
		bike();
		home() ;
		car();
		
		
	}

}
