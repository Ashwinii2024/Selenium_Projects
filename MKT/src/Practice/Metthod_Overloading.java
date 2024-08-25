package Practice;



public class Metthod_Overloading 

{
     
	 static void add(int a, int b) 
	
	{
		
		int c= a+b;
		System.out.println(c);
	}
	
	 static void add( int a, int b, int c)
	
	{
		int d = a*b*c;
		System.out.println(d);
		
	}
	void add(int j, int k, int l, int m) 
	{
		int e = j+k+l+m;
		System.out.println(e);
		
	}
	
	public static void main(String[] args)
	
	{
		
		add(2,3);
		add(3,2,4);
		Metthod_Overloading m1 = new Metthod_Overloading();
		m1.add(2, 3, 4, 7);

	}

}
