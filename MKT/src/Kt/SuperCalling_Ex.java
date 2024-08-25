package Kt;


class ParentClassConstructor

{
	ParentClassConstructor(int a)
	
	{
		System.out.println("ParentClassConstructor");
	}
	
	ParentClassConstructor(String b){
		System.out.println();
	}
	
	
}
public class SuperCalling_Ex  extends ParentClassConstructor

{
	
	SuperCalling_Ex()
	
	{
		
		super(2);
		System.out.println("SuperCalling_Ex");
		
	}

	public static void main(String[] args) 
	
	{
		
new SuperCalling_Ex();
	}

}
