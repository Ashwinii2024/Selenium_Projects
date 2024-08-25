package Kt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathsClass 

{

	public static void main(String[] args)
	
	{
		
	//2*pi*r
		
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("Print the value of radius");
try {
	int r = s1.nextInt();
	
	
	System.out.println("Print the value of pi");
	
	double pi = s1.nextDouble();
	
	double circumference_of_circle = 2*pi*r;
	
System.out.println("Calculate the cirumfer of crl");
	
	System.out.println(circumference_of_circle);
	
	
}
catch(InputMismatchException a1) {
	
	Scanner s2 = new Scanner(System.in);
	System.out.println("Please add the int value only");
	int r = s2.nextInt();
	
	
	System.out.println("Print the value of pi");
	
	double pi = s2.nextDouble();
	
	double circumference_of_circle = 2*pi*r;
	
System.out.println("Calculate the cirumfer of crl");
	
	System.out.println(circumference_of_circle);
	
	
	
	
	
	
}
	

	
	
		
	}
}

	
