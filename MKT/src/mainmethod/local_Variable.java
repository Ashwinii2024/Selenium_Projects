package mainmethod;

public class local_Variable
{
 
	
	static void add()          //static add method 
	{
		  
		 int a = 10;    // local variable
		 System.out.println(a);
	}
	
	void sub()            //non-static method
	
	{
		int a =20;
		System.out.println(a);
	}
	
	static void add(int a, int b) 
	{
		System.out.println("1");
	}
	
	void sub(int a, int b, int c) 
	{
		System.out.println("2");
	}
	
	local_Variable()            //constructor
	{
	  int a = 20;              // local variable
	  int b =30;
	  int c = a+ b;
	  System.out.println(c);
	}
	 
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		add();
		add(1,2);
	local_Variable l1 = new local_Variable();
	l1.sub();
		new local_Variable();
		l1.sub(1,1,1);
	}

}
