package Kt;

public class thiscalling 

{
	thiscalling(int i)
	{
		
		System.out.println(i);
	}
	
	thiscalling(String name)
	{
		this(2);
		System.out.println(name);
	}
	
	thiscalling(double weight)
	{
		this("Ram");
		System.out.println(weight);
	}

	public static void main(String[] args) 
	
	
	{
		new thiscalling(3.13);

	}

}
