package mainmethod;

class loginMethodOverriding

{
	
	void login() 
	{
		System.out.println("Login with gmail");
	}
}

public class MethodOverriding extends loginMethodOverriding

{ 
	void login() 
	
	{ 
		super.login();
		System.out.println("Login with mobile number");
	}
	
	public static void main(String[] args) 
	
	{
		
		MethodOverriding m1 = new MethodOverriding() ;
		m1.login();
		
		
	}

}
