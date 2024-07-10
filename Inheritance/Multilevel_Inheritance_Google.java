package Inheritance;

class Google_auth3

{
	static void auth3()
	
	{
		System.out.println("3");
	}
	
}

class Google_auth extends Google_auth3

{
	static void auth2() 
	{
		System.out.println("2");
	}
}

public class Multilevel_Inheritance_Google extends Google_auth 


{
	static void auth1() 
	
	{
		System.out.println("1");
	}

	public static void main(String[] args) 
	
	{

		auth1() ;
		auth2() ;
		auth3();
	}

}
