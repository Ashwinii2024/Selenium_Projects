package Assignment;

import java.util.Scanner;

public class Circumferance_Of_Trepezium 

{

	

	public static void main(String[] args) 
	
	{

//P = AB + BC + CD + AD
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Print AB");
		
		int AB = S1.nextInt();
		
		System.out.println("Print BC");
		
		int BC = S1.nextInt();
		
		System.out.println("Print CD");
		
		int CD = S1.nextInt();
		
		System.out.println("Print AD");
		
		int AD = S1.nextInt();
		
		System.out.println("Outpu of Circumferance Of Trepezium is");
		
		int CircumferanceOfTrepezium =  (AB + BC + CD + AD);
		
		System.out.println(CircumferanceOfTrepezium);
		
		
		
	}

}
