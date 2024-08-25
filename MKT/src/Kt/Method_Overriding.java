package Kt;

class ParentClass 
{
	void Payment(String a) {
		
		System.out.println("Pay With Google pay");
	}
	
	void add() {
		System.out.println("add");
	}
	
	
}

public class Method_Overriding extends  ParentClass

{
	
	void Payment(int a) {
		super.Payment("ashu");
		System.out.println("Pay With PhonePay");
	}
	
	void add() {
		super.add();
		System.out.println("sub");
	}
	public static void main(String[] args) 
	
	{
		Method_Overriding m1 = new Method_Overriding();
		m1.Payment(100);
		m1.add();
	}

}
