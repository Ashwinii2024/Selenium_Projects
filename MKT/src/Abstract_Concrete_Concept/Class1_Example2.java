package Abstract_Concrete_Concept;


 abstract class Class1_Example3

{
	abstract void abc();	 ///abstract method
	abstract void  uvw();     ///abstract method
	
	static void jkl()         //Concrete Method
	
	{    
		System.out.println("jkl");
	}
	
	void mno()                 //Concrete Method
	
	{
		System.out.println("mno");
	}
	
}
public class Class1_Example2 extends Class1_Example3


{
	
	
	static void opq() {
		System.out.println("opq");
	}
	
	void mnk() {
		System.out.println("mno");
	}
	
public static void main(String[] args)

{
	Class1_Example2 e1 = new Class1_Example2();
	e1.abc();
	e1.uvw();
	e1.jkl();
	e1.mno();
	e1.opq();
	e1.mnk();
	
	  
}

@Override
void abc() {
	// TODO Auto-generated method stub
	
}

@Override
void uvw() {
	// TODO Auto-generated method stub
	
}

}
