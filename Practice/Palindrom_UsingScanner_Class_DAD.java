package Practice;

import java.util.Scanner;

public class Palindrom_UsingScanner_Class_DAD 

{

	public static void main(String[] args) 
	
	{
		Scanner s1 = new Scanner(System.in);
		
		String input ="Dad";
		String output ="";
		
		for(int i = input.length()-1; i>=0; i--) 
		
		{
			
			char c1 = input.charAt(i);
			output= output+c1;
			
		}
		
		System.out.println(output);
		if(input.equals(output)) {
			
			System.out.println("Given string is palindrom");
		}
		
		System.out.println("Given string is not palindrom");
	}
	

}
