package Kt;


abstract class abstractclass

{
	abstract void add();
	abstract void sub();
	
	void mul()
{
		System.out.println("mul");
	}
	void xyz() {
		System.out.println("xyz");
	}
	
}
public class Abstract_Classsss extends abstractclass

{

	@Override
	void add() {
		
		
	}

	@Override
	void sub() {
		
		
	}

	void sum() 
	{
		System.out.println("sum");
	}
	
	void jhk() {
		System.out.println("mjk");
	}
	
	public static void main(String[] args) 
	
	
	{
		Abstract_Classsss a1 = new Abstract_Classsss();
		a1.sum();
		a1.jhk();
		a1.mul();
		a1.xyz();
		
		
	}

}
