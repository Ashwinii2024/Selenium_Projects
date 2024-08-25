package Assignment;

import java.util.Arrays;

public class String_How_Many_space_PresentEg {

	public static void main(String[] args) 
	
	{
		String input = "17 October 2024";
		
		int count_space = 0;
		
	char c1[] = input.toCharArray();
	
	System.out.println(Arrays.toString(c1));
	
	for(int i =0; i< input.length(); i++) {
		
	boolean b1 = Character.isWhitespace(c1[i]);
		
		if(b1==true) {
			
			count_space++;
		}
	}
	System.out.println(count_space);

	}

}
