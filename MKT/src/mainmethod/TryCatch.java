package mainmethod;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) 
	
	
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Print a");
		
			try {
		int a = s1.nextInt();
		System.out.println("print b");
		int b= s1.nextInt();
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException x)
		{System.out.println("I have handle the exception");}
		catch(InputMismatchException y) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Print a");
			int a = s2.nextInt();
			System.out.println("Print b");
			int b= s2.nextInt();
			int c= a/b;
			System.out.println(c);
			System.out.println("We handle the inputmisatch");
		}
	
}
}
