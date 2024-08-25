package Kt;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx 

{

	public static void main(String[] args) 
	
	
	{
		Scanner s1 = new Scanner(System.in);
		
		String name = s1.next();
		
		int count_alpha =0;
		int count_digit =0;
		int count_whitespace =0;
		
		char c1[] = name.toCharArray();
		
		
		System.out.println(Arrays.toString(c1));
		
		for(int i =0;i<name.length(); i++) 
		
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			
		   boolean b3 =Character.isWhitespace(c1[i]);
		
		
			if(b2==true) 
			
			{
				count_digit++;
			}
			
			if(b1 ==true) {
				
				count_alpha++;
			}
			if(b3==true) {
				
				count_whitespace++;
			}
			
		}
		System.out.println("count_alpha--->" + count_alpha);
		System.out.println("count_digit--->" +count_digit);
		int count_spl_character = (name.length()-(count_alpha+count_digit));
		System.out.println("count_spl_character--->" + count_spl_character);
		System.out.println("count_whitespace--->" + count_whitespace);
	}

}
