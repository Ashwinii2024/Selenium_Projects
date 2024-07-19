package mainmethod;

public class Constructor                       //ClassName
{
	
	 Constructor()                            //constructor are always non-static constructor
	{ 
		System.out.println("xyz");
	}
	Constructor(int a) {
		a = 10;
		System.out.println(a);
	}

	Constructor(int a, int b) {
		int sum = a+ b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)         //Main Method
	
	{
		
		Constructor C1 = new Constructor();    //calling the constructor
		 new Constructor();
		 new Constructor(100) ;
		 new Constructor(2,6) ;
		
	}


		
	}


