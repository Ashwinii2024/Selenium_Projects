package Kt;

interface Google_auth

{
	void login();
	void logout();
	
}

public class Interface implements Google_auth

{	@Override
	public void login() 
{
	
	System.out.println("login");
}

@Override
public void logout() 

{
	System.out.println("logout");
	
}
	
	static void 
	xyz() {
		System.out.println("xyz");
	}
	
	void bhg() {
		System.out.println("bhg");
	}

	public static void main(String[] args)
	
	{
		Interface i1 = new Interface();
		i1.bhg();
		xyz();
		i1.logout();
     	i1.login();
		
	}



}
