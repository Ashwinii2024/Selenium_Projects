package Assignment;

import java.util.Scanner;

public class Area_Of_Trepezium {

	public static void main(String[] args) {
		
		// h * (b1 + b2/2) 
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Print the value h");
		
		int h = S1.nextInt();
		
		System.out.println("Print the value of b1");
		
		int b1 = S1.nextInt();
		
	   System.out.println("Print the value of b2");
		
		int b2 = S1.nextInt();
		
		System.out.println("Print the value of Area Of Trepezium");
		
		int Area_Of_Trepezium = h * (b1 + b2/2) ;
		
		System.out.println(Area_Of_Trepezium);
		
		
		
		
		
		
		
		
		
	}

}
