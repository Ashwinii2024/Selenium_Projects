package Java_Assignments;

class SuperParent3 

{
	void add(int a, int b) {
		int c= a*b;
		System.out.println(c);
	}
	
}
public class Super_keyword_Assignment51 extends SuperParent3
{

	void add(int a, int b) {
		super.add(2, 3);
		int c= a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	
	{
		
		Super_keyword_Assignment51 s1 = new Super_keyword_Assignment51();
		s1.add(2, 3);
		
	}

}
