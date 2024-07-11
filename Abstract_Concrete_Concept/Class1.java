package Abstract_Concrete_Concept;


abstract class Class3

{
	
	abstract void add();
	abstract void sum();
}

abstract class Class2 extends Class3               //in class2 added concrete methods static and nonstatic

{
	static void static_concrete_Method() {
		System.out.println("add static concretemethod");
	}
	
	void Non_Static_Concrete_Method() {
		
		System.out.println("add non-static concretemethod");
	}

	
	
}
public class Class1 extends Class2


{  
	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sum() {
		// TODO Auto-generated method stub
		
	}
	
	static void staticconcrete() {
		System.out.println("staticconcrete");
	}
	
	void nonstaticconcrete() {
		System.out.println("nonstaticc concrete");
	}
	
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.add();
		c1.sum();
		c1.static_concrete_Method();
		c1.Non_Static_Concrete_Method();
		c1.staticconcrete();
		c1.nonstaticconcrete();
		
	}

	

}
