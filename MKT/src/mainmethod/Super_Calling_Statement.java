package mainmethod;



class raver {
	
	raver(){
		System.out.println("5");
	}
}

class city_class extends raver
{
	city_class(String a)
	
	{
		System.out.println("1");
		
	}
}


class state_class extends city_class

{
	
	state_class(int a)
	
	{
		super("Manish");
		System.out.println("Parent Class Constructor can be call from the child class constructor");
	}
}
public class Super_Calling_Statement extends state_class

   
{
	
	Super_Calling_Statement()
	
	{
		super(100);
		System.out.println("Child class constructor");
	}
	
   public static void main(String[] args)
   
   {
	   
	   new Super_Calling_Statement();
	   
   }
}
