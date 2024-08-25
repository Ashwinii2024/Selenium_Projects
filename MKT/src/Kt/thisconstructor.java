package Kt;

public class thisconstructor



{
	thisconstructor(int i)
	
	{
		System.out.println(i);
	}
	
	thisconstructor(String name)
	
	{    this(23);
		System.out.println(name);
	}
	
	thisconstructor(char c)
	
	{
		this("Ram");
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		new thisconstructor('a');

	}

}
