package Assignment;

import java.util.Scanner;

public class Circumferance_Of_Circle {

	public static void main(String[] args) 
	{
		
		Scanner S1 = new Scanner(System.in);
		
	    System.out.println("Print radius");
	
        int radius = S1.nextInt();
        
        
        System.out.println("Circumferance Of Circle is ");
        
        double  CircumferanceOfCircle = 2 *Math.PI* radius;
       
        System.out.println(CircumferanceOfCircle);
       
       
       
       
	}

}
