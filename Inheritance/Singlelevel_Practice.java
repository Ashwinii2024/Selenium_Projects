package Inheritance;

 
class loginpage                          //Parents class
{
	void login() 
	{
		System.out.println("Login with google");
	}
}

public class Singlelevel_Practice extends loginpage

{
	
void Homepage()
	
	{
		System.out.println("Login with home page");
	}
	
void add() {
	System.out.println("1");
}
	public static void main(String[] args) 
	
	{
		Singlelevel_Practice S1 = new Singlelevel_Practice();
		S1.Homepage();
		S1.login() ;
		
		S1.add();
		//S1.hbx() ;
	}

}
