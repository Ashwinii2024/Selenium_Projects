package Practice;

import java.util.Arrays;

public class Countthealphabets {

	public static void main(String[] args)
	
	
	{
		String input =  "world is full of beautiful people";
		
		int count_alpha = 0;
		
		char c1[] = input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i =0; i<input.length(); i++) 
		
		{
			
			
		boolean b1 = Character.isAlphabetic(c1[i]);
		if(b1 == true) 
			
			
		{
			count_alpha++;
			
		}
		
		}
		
		System.out.println(count_alpha);

	}

}
