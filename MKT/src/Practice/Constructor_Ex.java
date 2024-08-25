package Practice;

public class Constructor_Ex 

{ 
	Constructor_Ex()
	{
		
		System.out.println("Constructor are always non-static in nature");
	}
	
	Constructor_Ex(int a, int b)
	
	{

		int c= a+b;
		System.out.println(c);
		
	}
	
	Constructor_Ex(String s)
	
	{
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args)
	
	{
		Constructor_Ex c1 = new Constructor_Ex();
		//new Constructor_Ex();
		
	    new Constructor_Ex(3,4);
	    new Constructor_Ex("Ashu");
		
	}
	
	

	

}
