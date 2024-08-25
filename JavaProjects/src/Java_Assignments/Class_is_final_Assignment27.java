package Java_Assignments;

final class Parents 

{
	static void add(String name)
	{
		System.out.println("Ashwini");
	}
	
}

public class Class_is_final_Assignment27 extends  Parents

{
	static void add(String name) {
		System.out.println("xyz");
	}
	

	public static void main(String[] args)
	
	{
		Class_is_final_Assignment27 c1 = new Class_is_final_Assignment27();
		c1.add("abc");
		c1.add("ashu");
	}

}
