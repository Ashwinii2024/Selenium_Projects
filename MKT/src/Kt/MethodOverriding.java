package Kt;


class parentclass1


{
	void add(int i) 
	
	{
		
		System.out.println(i);
	}
	
}

public class MethodOverriding extends parentclass1

{
	
	void add(int i) 
	
	{   
		
		super.add(200);
		System.out.println(i);
	}

	public static void main(String[] args) 
	
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.add(100);

	}

}
