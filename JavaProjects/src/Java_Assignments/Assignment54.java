package Java_Assignments;


interface GrandParents 

{
	void add();
		
	
}

	interface parents extends GrandParents

{
	void sum();
	
	
}


public class Assignment54 implements parents

{

	static void name(String name) {
		System.out.println(name);
	}
	@Override
	public void add()
	{
		System.out.println("add");
		
	}
	@Override
	public void sum() 
	{
		System.out.println("sum");
		
	}
	public static void main(String[] args) 
	
	{
		Assignment54 a1 =new Assignment54();
		name("ashwini");
		a1.add();
		a1.sum() ;
       
	}
	
}


