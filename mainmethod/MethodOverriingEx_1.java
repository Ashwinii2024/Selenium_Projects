package mainmethod;

class MethodOverriingEx_2
{
	void add(int a, int b) 
	{
		
		int c = a + b;
		System.out.println(c);
	}
}
public class MethodOverriingEx_1 extends MethodOverriingEx_2

{
	void add(int a, int b) 
	{
		super.add(6, 9);
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	
	{
		
		MethodOverriingEx_1 m1 = new MethodOverriingEx_1();
		
		m1.add(4,6);
	}

}
