package Java_Assignments;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputmismatchException_and_try_to_handl_it_Assignment_68 {

	public static void main(String[] args) 
	{
	
      Scanner s1 = new Scanner(System.in);
      
      int a= s1.nextInt();
      int b=0;
      boolean validvalue =false;
      while(!validvalue) {
      try {
    	System.out.println("Please add the integer value");
       b = s1.nextInt(); 
       validvalue = true; // If no exception, input is valid
      }
      catch(InputMismatchException n) {
    	  System.out.println("Please enter a valid integer value.");
          s1.next();    // Clear the invalid input
      }
     int c= a*b;
     System.out.println(c);
     }
	}

}
