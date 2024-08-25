package mainmethod;

public class How_tocall_the_Non_static_parameterized

{
	How_tocall_the_Non_static_parameterized()
	
	{
		int a= 2;
		int b=3;
		int sum = a+b;
		System.out.println(sum);
	}
	
	void add(int a , int b)
	{
		int add = a + b;
		System.out.println(add);
		
	}
	
	void add(int a, int b,int c) 
	{
		int add = a + b + c;
		System.out.println(add);
		
	}
	static void add(double a, int b) 
	{
		a = 3.14;
		b = 4;
		double add = a + b;
		System.out.println(add);
	}
		
		static void mul(double a, int b, int c, int d)
		
		{
			  
			double mul = a*b*c*d;
			System.out.println(mul);
			
		}
		void mul(int a, int b, int c, int d) {
			int mul = a*b*c*d;
			System.out.println(mul);
		}
	
	public static void main(String[] args)
	
	{
		
		How_tocall_the_Non_static_parameterized h1 = new How_tocall_the_Non_static_parameterized();
		h1.add(12,1);
		h1.add(1,2,3);
		add(3.13,3);
		mul(3.89,3,4,2);
		h1.mul(1, 2, 3, 33);
		
	
	}

}
