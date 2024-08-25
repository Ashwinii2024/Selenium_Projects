package Kt;


class subclassconstructor2{
	
	subclassconstructor2(String name){
		
		System.out.println("Grand Parent class");
	}
}
class subclassconstructor extends subclassconstructor2

{
	
	subclassconstructor(int i)
	
	{
		super("Ram");
	    System.out.println(i);	
		
	}
}
public class Supercallingstatement extends subclassconstructor

{
	Supercallingstatement()
	
	{
		super(100);
		System.out.println("child statement");
		
	}

	public static void main(String[] args) 
	
	{
		new Supercallingstatement();
		
	}

}
