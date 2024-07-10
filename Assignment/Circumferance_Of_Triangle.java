package Assignment;

import java.util.Scanner;

public class Circumferance_Of_Triangle {

	public static void main(String[] args) 
	
	{
		// circumference of a triangle = a + b + c
		
		Scanner S1= new Scanner(System.in);
		
		System.out.println("Print the vale of a");
		
		int a = S1.nextInt();
		
		System.out.println("Print the vale of b");
		
		int b = S1.nextInt();
		
		System.out.println("Print the vale of c");
		
		int c = S1.nextInt();
		
		System.out.println("Outpu of Circumferance Of Triangle is");
		
		int circumferenceoftriangle = a + b + c;
		
		System.out.println(circumferenceoftriangle);
		
		

	}

}
