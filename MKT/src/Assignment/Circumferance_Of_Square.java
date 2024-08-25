package Assignment;

import java.util.Scanner;

public class Circumferance_Of_Square {

	public static void main(String[] args) 
	
	{
		Scanner S1 = new Scanner (System.in);
		
		//4 * a
		System.out.println("Print the value of a");
		
		int a = S1.nextInt();
		System.out.println("Output of Circumferance Of Square is: ");
		
		int CircumferanceOfSquare = 4 * a;
		
		System.out.println(CircumferanceOfSquare);

	}

}
