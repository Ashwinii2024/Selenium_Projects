package Java_Assignments;

class Parent 

{
	 final  void Mul(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	
}
public class Method_is_final_Assignment26 extends Parent

{
	 void Mul(int a, int b) {
		
		int c= a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args)
	
	{
		Method_is_final_Assignment26 m1 = new Method_is_final_Assignment26();
		m1.add(2,3);
		m1.Mul(3,4);
	}

}
