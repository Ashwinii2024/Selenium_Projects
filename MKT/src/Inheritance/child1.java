package Inheritance;

public class child1 extends Parent1

{
	static void add() {
		System.out.println("child1");
	}

	public static void main(String[] args) 
	
	{
		add();
		parentclass();
		child1 c1 = new child1();
		c1.hybridlevel();
		
	}

}
