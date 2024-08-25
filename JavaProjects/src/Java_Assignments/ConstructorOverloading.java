package Java_Assignments;

public class ConstructorOverloading {
	ConstructorOverloading()                            //constructor are always non-static constructor
		{ 
			System.out.println("xyz");
		}
	ConstructorOverloading(String name, boolean b)
	{
		name = "Ashwini";

	}
	ConstructorOverloading(int a) {
			a = 10;
			System.out.println(a);
		}

	ConstructorOverloading(int a, int b) {
			int sum = a+ b;
			System.out.println(sum);
		}
	
		
		public static void main(String[] args)         //Main Method
		
		{
			
			ConstructorOverloading C1 = new ConstructorOverloading();    //calling the constructor
			 new ConstructorOverloading();
			 new ConstructorOverloading("Ashwini",false);
			 new ConstructorOverloading(100) ;
			 new ConstructorOverloading(2,6) ;
		}
	
}
