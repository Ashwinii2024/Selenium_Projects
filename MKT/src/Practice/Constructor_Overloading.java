package Practice;

public class Constructor_Overloading 

{
	Constructor_Overloading()
	{
		
		System.out.println(Math.addExact(2, 3));
	}
	
	Constructor_Overloading(int a, int b)
	
	{
		System.out.println(Math.multiplyExact(a,b));
		
	}
	
	
	Constructor_Overloading(String name)
	{
		System.out.println(name);
	}
	
	Constructor_Overloading(int a, int b, int c)
	
	{
		int sum =a+b+c;
		System.out.println(sum);
	}
	
	
	
   public static void main(String[] args) 
   {
	 //  Constructor_Overloading c1 = new Constructor_Overloading();
	   new Constructor_Overloading();
	   new Constructor_Overloading(7,6);
	   new Constructor_Overloading("Ram");
	   new Constructor_Overloading(2,3,1);
	   
	   
   }
}
