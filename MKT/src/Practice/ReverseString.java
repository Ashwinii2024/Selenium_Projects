package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String name = "My Name is Ashwini Yogesh Pawar@.))_(& 09876123";
		
		
		int whitespace =0;
		int total_alpha=0;
		int numbers;
		
		char c1[] = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<name.length(); i++) {
			
			boolean b1 = Character.isWhitespace(c1[i]);
			boolean b2 = Character .isAlphabetic(c1[i]);
			boolean b3= Character.isDigit(c1[i]);
			if( b1 == true ) {
				whitespace++;
				
			}
			
		}
		System.out.println(whitespace);
		
	}
		
		
		
	
}

