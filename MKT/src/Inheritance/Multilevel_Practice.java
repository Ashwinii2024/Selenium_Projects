package Inheritance;


class GrandParentClass{
	void sub() {
		int a = Math.addExact(25, 5);
		System.out.println(a);
	}
}

class ParentClass extends GrandParentClass

{
	static void xyz() {
		System.out.println("xyz");
	}
}
public class Multilevel_Practice extends ParentClass



{
	
	
	static void add() {
		int a= Math.addExact(23,4);
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		add();
		xyz();
		Multilevel_Practice M1 = new Multilevel_Practice();
		M1.sub() ;

	}

}
