package Kt;

public class This_Calling 
{
	This_Calling(String s)
	
	{
		System.out.println("first 1");
	}
	
	
	This_Calling(int a)
	{
		this("Ram");
		System.out.println("first 2");
	}
	
	This_Calling(int a, int b)
	{
		this(100);
		int c= a*b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	
	{
		new This_Calling(2,4);
		
	}

}
