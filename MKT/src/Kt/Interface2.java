package Kt;
interface Google

{
	void loginwithMobile();
	void loginwithEmailId();
	
}

interface Facebook extends Google

{
	void login();
	void logout();
}

public class Interface2 implements Facebook


{
	@Override
	public void loginwithMobile() 
	{
		System.out.println("loginwithMobile");
		
	}

	@Override
	public void loginwithEmailId() {
		System.out.println("loginwithEmailId");
	}

	@Override
	public void login() {
		System.out.println("login");
		
	}

	@Override
	public void logout() 
	{
		System.out.println("logout");
		
	}
   public static void main(String[] args)
	
   {
	   Interface2 i1 = new Interface2();
	   i1.login();
	   i1.logout();
	   i1.loginwithMobile();
	   i1.loginwithEmailId();

	}



}
