package Kt;


class GrandParents

{
	static void GrandParentsname()
	
	{
		System.out.println("Ajabsing");
		
	}
	void xyz() {
		System.out.println("xyz");
	}
	
}


class Parents extends GrandParents

{
   void parentsname() {
	   System.out.println("Pradip");
   }
}
public class MultiLevel_Inheritance_Inheritance1 extends Parents




{
	static void myName() {
		System.out.println("Ashwini");
	}
	void add() {
		System.out.println("Nakshu");
	}

	public static void main(String[] args) 
	
	{
		myName();
		GrandParentsname();
		MultiLevel_Inheritance_Inheritance1 m1 = new MultiLevel_Inheritance_Inheritance1();
		m1.xyz();
		m1.parentsname();
		m1.add();
		

	}

}
