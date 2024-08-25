package Kt;

 class parentclass2
{
	
	void login(String name) {
		
		System.out.println(name);
	}
}
public class MethodOverride extends parentclass2

{
	
void login(String name) 

{
		super.login(name);
	System.out.println(name);
		
	}

	public static void main(String[] args) 
	{
		MethodOverride m1 = new MethodOverride();
		m1.login("Ram");

	}

}
