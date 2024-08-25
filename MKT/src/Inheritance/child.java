package Inheritance;

class world

{
  static void Father() 
  
  {
	  int Fatherage = 58;
	  System.out.println(Fatherage);
	  
  }
  
  
}


public class child extends world             //child class

{
	

	static void childsage() 
	{
		int childsage = 12;
		System.out.println(childsage);
	}

	public static void main(String[] args) 
	
	
	{
		childsage();
		Father();
		
		

	}

}
