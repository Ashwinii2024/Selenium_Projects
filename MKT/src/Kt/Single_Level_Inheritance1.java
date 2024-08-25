package Kt;


class Parent_Class

{
	
	static void FatherName() 
	
	{
		
		System.out.println("Pradip");
	}
	
	void MotherName() {
		
		System.out.println("Savita");
		
	}
	
	
}
public class Single_Level_Inheritance1 extends Parent_Class

{
	
	static void Myname() 
	{
		System.out.println("Ashwini");
	}

	void Daughtername() 
	{
		System.out.println("Nakshatra");
	}
	public static void main(String[] args) 
	
	{
		Myname();
		Single_Level_Inheritance1 s1 = new Single_Level_Inheritance1();
		s1.Daughtername();
		FatherName();
		s1.MotherName();
		

	}

}
