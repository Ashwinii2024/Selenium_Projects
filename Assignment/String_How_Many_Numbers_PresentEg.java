package Assignment;

import java.util.Arrays;

public class String_How_Many_Numbers_PresentEg {

	public static void main(String[] args) 
	
	{
		
	String name ="Names 123";
	
	int count_number = 0;
	int count_alpha = 0;
	int count_space = 0;
		
	char c1[]=name.toCharArray();
	
	System.out.println(Arrays.toString(c1));
	
	for(int i = 0; i<name.length(); i++)
		
	{
		boolean b1 = Character.isDigit(c1[i]);
		boolean b2 = Character.isAlphabetic(c1[i]);
		boolean b3 = Character.isWhitespace(c1[i]);
		
		if(b1 == true) {
			
			count_number++;
		}
		if(b2==true) {
			count_alpha++;
			
		}
		if(b3 ==true) {
			
			count_space++;
		}
	}
	
	System.out.println(count_number);
	
	System.out.println(count_alpha);
	
	System.out.println(count_space);
	
	}

}
