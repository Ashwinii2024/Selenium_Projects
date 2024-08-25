package mainmethod;

import java.util.Arrays;

public class String_How_Many_Numbers_Present {

	public static void main(String[] args) 
	
	{
		String name = "50Cent";
		
		int count_number = 0;
		
		char c1[] = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i =0; i<name.length(); i++) 
		
		{
			boolean b1 = Character.isDigit(c1[i]);
			
			if(b1==true) {
				
				count_number++;
			}
			
		}
		System.out.println(count_number);
		
	}

}
