
package mainmethod;

public class SIB_IIB {
	
	static
	{
		
		System.out.println("SIB_Class");
	}
	{

        int age =20;
        if(age>=20) 
        {
	    System.out.println("True");
        }

        else {
	System.out.println("False");
}
	}
	
	{
		System.out.println("IIB_Class 2");  ///IIB
	}
	
	{
		System.out.println("IIB_Class 3");  ///IIB
	}
	SIB_IIB(int a, int b)
	
	{
		
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		new SIB_IIB(4,8);
		System.out.println("Main Method");
		
		
		
	}


}
