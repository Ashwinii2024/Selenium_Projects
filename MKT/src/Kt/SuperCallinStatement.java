package Kt;


class ParentConstructor 
{
	ParentConstructor(int a)
	{
		
		System.out.println("ParentConstructor");
	}
	
}
public class SuperCallinStatement extends ParentConstructor
{
	
	SuperCallinStatement(String a)
	
	{
		super(100);
		System.out.println("SuperCallinStatement");
		
	}

	public static void main(String[] args) 
	
	
	{
	new	SuperCallinStatement("ashu");

	}

}
