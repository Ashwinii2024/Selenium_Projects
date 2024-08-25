package Inheritance;

public class Parent1 

{
	
	static void parentclass() {
		System.out.println("hybridlevelinheritance");
	}
	
	void hybridlevel() {
		System.out.println("hybridlevel non static");
	}

	public static void main(String[] args) {
		parentclass();
		Parent1 p1 = new Parent1();
		p1.hybridlevel();

	}

}
