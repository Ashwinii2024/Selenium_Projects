package Inheritance;

class Fathers {
	
	void Fathersage() {
		int Fathersage = 43;
		System.out.println(Fathersage);
	}
	
}

class Mother extends Fathers

{
	
	void Mothersage() 
	
	{
		int Mothersage = 40;
		System.out.println(Mothersage);
	}
	
}


public class Multilevel_Nonstatic extends Mother                      //child class

{
	
	void child() {
		
		int childsage = 12;
		System.out.println(childsage);
		
	
	}

	public static void main(String[] args) 
	{

		Multilevel_Nonstatic M1 = new Multilevel_Nonstatic();
		M1.child();
		M1.Mothersage();
		M1.Fathersage();
		
		

	}

}
