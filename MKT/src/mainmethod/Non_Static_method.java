package mainmethod;

public class Non_Static_method //classname
{
	
	void name()   //non-static method 
	{
		System.out.println("How to call the non-static method in main method");
	}
	
	void sum(int a , int b)   //non-static method 
	{
	int	sum = a + b;
		System.out.println(sum);
	}
	
  static void xyz()   //static method  
  {
	  System.out.println("hugh");
  }

  static void add(int a, int b, String nameee) //static method 
  
 { 
	  a= 4;
	  b = 4;
	  String namee = "ashu";
      int add = a + b;
	  System.out.println(add);
  }
	public static void main(String[] args)  //main method
	
	{
		// TODO Auto-generated method stub
		
		Non_Static_method S1 = new Non_Static_method();
		S1 .name();  //non-static methods calling
		S1.sum(2,3);  //non-static methods calling
		add(4,5,"ashwini");    //static methods calling
		xyz() ;      //static methods calling
		 

	}

}
