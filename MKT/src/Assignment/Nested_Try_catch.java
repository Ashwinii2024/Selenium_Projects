package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_Try_catch {

	public static void main(String[] args) 
	
	
	{

		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = s1.next();
try 
	{
		
		System.out.println("Enter your age");
		int age = s1.nextInt();
		
			
		System.out.println("Enter your phone number");
		
	    int number =s1.nextInt();
	    
		}

		
		catch(InputMismatchException n1) 
		
		{
			
	    System.out.println("Try to add mobile numbeer");
		Scanner s2 = new Scanner(System.in);
		try 
		
		{
			
		int i = s2.nextInt();
		
		}
		
		catch(InputMismatchException n2) 
		
		{
			System.out.println("Add mobile Number");
			
		
			Scanner s3 = new Scanner(System.in);
			
			int number2 = s3.nextInt();
			
			System.out.println(number2);
		
			
			
}
		
		finally 
		
		{
			
			System.out.println("Finally will execute");
			
		}
		
		}
		
		
	}
		
		
		}
		
		
		
		
		
		
		

	


