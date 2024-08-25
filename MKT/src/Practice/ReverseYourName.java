package Practice;

import java.util.Arrays;

public class ReverseYourName {

	public static void main(String[] args) 
	
	{
		String input ="Ashwini";
		String output = " ";
		
		char c1[] = input.toCharArray();
		
	for(int i =0; i>input.length();i--) 
	
	{
		
		char s1 = input.charAt(i);
		
	
	
		output = output + s1;
		
		
	}
	
	System.out.println(output);
				

	}
	

}
