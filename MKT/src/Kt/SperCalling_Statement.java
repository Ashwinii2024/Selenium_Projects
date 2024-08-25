package Kt;

class CountryClass {
	
	CountryClass(String a){
		System.out.println("CountryClass");
	}
	
}
class StateClass extends CountryClass

{
	
	
	 StateClass(int a, int b)
	 {
		 super("ashu");
		 int c= a*b;
		 System.out.println(c);
	 }
	 
}
public class SperCalling_Statement extends StateClass

{
	SperCalling_Statement() 
   
   {
	   
	 super(1,2);
	  System.out.println("Constructor_Can_Inherited_Or_Not");
  }
	
	public static void main(String[] args) 
	
	
	{
		new SperCalling_Statement();
		
	}

}
