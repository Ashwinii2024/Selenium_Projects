package mainmethod;

class Parent_Class12

{
	
	void mul() {
		
		System.out.println("mul");
	}
}
class Parent_Class1 extends Parent_Class12

{
	static void sum() {
		System.out.println("sum");
	}
	
	static void xyz() {
		System.out.println("xyz");
	}
}

public class Class_UpCasting extends Parent_Class1

{
	
	
	void add() {
		
		System.out.println("add");
	}
	
	static void sub() {
		
		System.out.println("sub");
	}

	public static void main(String[] args) 
	
	
	{
		//upcasting implicit
		Parent_Class1 p1	= new Class_UpCasting();
		//Parent_Class1 p1	=(Parent_Class1) new Class_UpCasting(); 
		
		p1.sum();
		p1.mul();
		p1.xyz();
		
		
		//downcasting 
		Class_UpCasting c1	=  (Class_UpCasting) new Parent_Class1();
		
		c1.add();
		c1.mul();
		c1.sub();
		c1.sum();
		
		
	}

}
