package mainmethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling_Try_And_Catch1

{

	public static void main(String[] args)
	
	{
		Scanner s1 = new Scanner(System.in);
		
		int a = s1.nextInt();
		
		int b= s1.nextInt();
		
		try {	
		int c = a/b;
		
		
		System.out.println(c);
		
		}
		catch(ArithmeticException x)
		{
			System.out.println("we handle exception");
		}
		
		catch(InputMismatchException d) {
			System.out.println("we handle exception2");
		}
		
		
	}

}


