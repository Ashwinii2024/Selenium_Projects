package Inheritance;

public class child2 extends Parent1

{
   void xyz() {
	   System.out.println("child2");
   }
	public static void main(String[] args)
	
	{
		child2 c1 = new child2();
		c1.xyz();
		c1.hybridlevel();
		parentclass();
	}

}
