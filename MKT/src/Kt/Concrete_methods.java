package Kt;

abstract class Abstract_Method1

{
	abstract void Abstract1();
	abstract void Abstract2();
	
	static void sum(int a, int b) 
	
	{
		int c= a+b;
		System.out.println(c);
		
	}
	
	void xyz() {
		System.out.println("xyz");
	}
	
}
public class Concrete_methods extends Abstract_Method1

{
	@Override
	void Abstract1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void Abstract2() {
		// TODO Auto-generated method stub
		
	}
	static void add(int a, int b)
	
	{
           int c =  a*b;
           System.out.println(c);
	}
	void sub()
	
	{
		System.out.println("sub");
	}
	

	public static void main(String[] args) 
	
	{
		Concrete_methods c1 = new Concrete_methods();
		add(2,3);
		c1.sub();
		sum(2,1);
		c1.xyz();
		
	}
} 
