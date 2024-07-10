package Assignment;

class MathClass 

{
	
	static void pi() 
	
	{
		 double pi = Math.PI;
		 System.out.println(pi);
	}
	
}

public class Single_Level_Inheritance  extends MathClass

{
	
	
	static void add() {
		int a= Math.addExact(2, 4);
		System.out.println(a);
	}

	public static void main(String[] args) 
	
	{
		
		add();
		pi() ;
	}

}
