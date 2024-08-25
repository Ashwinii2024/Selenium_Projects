package mainmethod;

public class global_variable    //class name

{
	
       static double pi = 3.14;       //globl variable
       static int a = 9;               //globl variable
       static String name ;
       static int c;
       int no_of_days = 365;
       static int b = 23;
       
       
       static void add() {
    	   int r = 4;
    	   double area_of_circle = pi * 4 *4; 
    	   System.out.println(area_of_circle);
       }
      static void addd() {
    	  int add = a + b ;
    	  System.out.println(add);
    	  
      }
      void mul() {
    	int  mul = a * b;
    	System.out.println(mul);
    	  
    	  
      }
       
	public static void main(String[] args)     //main method
	
	{
		int  b = 3;
		int sum = a+b;
		System.out.println(sum);
		addd();
		add();
		int mul = b * a;
		System.out.println(mul);
		System.out.println(c);
		System.out.println(name);
		
		global_variable g1 = new global_variable();
		System.out.println(g1.no_of_days);
		g1.no_of_days = 366;
		System.out.println(g1.no_of_days );
		g1.mul();
		
		
		
		
	}

}
