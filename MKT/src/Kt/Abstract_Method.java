package Kt;

abstract class AbstractClass

{
	abstract void add();
	abstract void sub();
	
}
public class Abstract_Method extends AbstractClass

{
	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}
	static void xyz() {
		System.out.println("xyz");
	}
	
	void mul() {
		System.out.println("mul");
	}
	
	
	public static void main(String[] args) 
	
	
	{
		
		Abstract_Method a1 = new Abstract_Method();
		xyz();
		a1.mul();
	}

	

	

}
