package Practice;

import java.util.Arrays;

public class ReverseStrinh_Ex {

	public static void main(String[] args) 
	
	{
		String input = "ashwini";
		String output = "";
		
		for(int i = input.length()-1; i>=0 ; i--) {
			
		char c	= input.charAt(i);
	output = output + c;
	
	
		
		}
		System.out.println(output);
		
		
		

	}

}
