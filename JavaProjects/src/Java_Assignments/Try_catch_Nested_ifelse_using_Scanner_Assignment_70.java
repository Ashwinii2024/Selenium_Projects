package Java_Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_Nested_ifelse_using_Scanner_Assignment_70 {

	public static void main(String[] args) 
	
	
	{ 
		
		Scanner s1 = new Scanner(System.in);

		        try 
		        
		        {
		            System.out.print("Enter the first integer (a): ");
		            int a = s1.nextInt();

		            try 
		            
		         {
		                System.out.print("Enter the second integer (b): ");
		                int b = s1.nextInt();

		                try 
		                
		          {
		                    System.out.print("Enter the third integer (c): ");
		                    int c = s1.nextInt();

		                    // Perform a calculation or operation
		                    int sum = a + b + c;
		                    System.out.println("The sum of a, b, and c is: " + sum);
		           } 
		                
		                
		                catch (InputMismatchException e) 
		                
		                {
		                    System.out.println("The third value (c) must be an integer.");
		                }

		            } 
		            
		            catch (InputMismatchException e) 
		            
		            {
		                System.out.println("The second value (b) must be an integer.");
		            }

		        } 
		        catch (InputMismatchException e)
		        
		        {
		            System.out.println("The first value (a) must be an integer.");
		        }

	}

}
