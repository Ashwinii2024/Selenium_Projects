package mainmethod;

import java.util.Arrays;

public class String_How_Many_Alphabetsare_Present {

	public static void main(String[] args)
	
	{
		String input = "50cent";
		
		int count_of_alpha =0;
		
		int count_number=0;
		
		//convert string into char
		
	char c1[]	= input.toCharArray();
	
	System.out.println(Arrays.toString(c1));
	
	for(int i=0; i<input.length(); i++) 
	{
		boolean b1 = Character.isAlphabetic(c1[i]);
	
	if(b1==true)
	
	{
		
		count_of_alpha++;
		
	}
	
	}
	
	System.out.println(count_of_alpha);
	
	}
}
