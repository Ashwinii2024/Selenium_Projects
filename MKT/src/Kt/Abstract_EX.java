package Kt;


abstract class abstractclass1

{
	abstract void xyz();
	abstract void jhm();
	
}

abstract class concreteclass extends abstractclass1

{
	
	
	static void add() {
		System.out.println("add");
	}
	
	 void sub() {
		System.out.println("sub");
	}
	
}
public class Abstract_EX extends concreteclass

  {
	@Override
	void xyz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void jhm() {
		// TODO Auto-generated method stub
		
	}
    void login()

   {
    	
	System.out.println("Login with mobile");
   
   }

	public static void main(String[] args) 
	
	{
		Abstract_EX a1 = new Abstract_EX();
		a1.login();
		add();
		a1.sub();
		

	}

}
