package mainmethod;

import java.util.Scanner;

//import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);      //Object of Scanner class
		
	 System.out.println("Print the value of a:");
		
		int a =	s1.nextInt();
		
		System.out.println("Print the value of b:");
		
	int b = s1.nextInt();
	
	int sum = a + b;
	
	System.out.println("Print the value of sum:");
	
	System.out.println(sum);
	
	System.out.println("Print the String value:");
	String S = s1.next();
	
	System.out.println("Print the double value:");
	
	double d = s1.nextDouble();
	
	
	
		
		

	}

}
