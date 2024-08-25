package Practice;

abstract class Abstract_Class3

{
	abstract void add1();
	
	abstract void sum1();
	
}

class Abstract_Class2 extends Abstract_Class3

{
	void add3() {
		System.out.println("add3");
	}
	
	static void add4() {
		System.out.println("add4");
	}

	@Override
	void add1() {
		System.out.println("bjjk");
		
	}

	@Override
	void sum1() {
		
		System.out.println("huhiuhi");
	}
	
}

public class Abstract_Class1  extends Abstract_Class2

{
	static void add() {
		
		System.out.println("Add");
	}
	
	
	public static void main(String [] args) 
	
	{
		Abstract_Class1 a1 = new Abstract_Class1();
		a1.add3();
		add();
		add4();
		a1.add1();
		a1.sum1();
		
	}

}
