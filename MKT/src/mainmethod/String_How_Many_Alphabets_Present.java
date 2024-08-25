package mainmethod;

import java.util.Arrays;

public class String_How_Many_Alphabets_Present {

	public static void main(String[] args) 
	
	{
		String s1 = "Name123";
		int count_alpha = 0;
		
char c1[] = s1.toCharArray();

System.out.println(Arrays.toString(c1));

for(int i =0; i< s1.length(); i++) 

{
	
	boolean b1 = Character.isAlphabetic(c1[i]);
	
	if(b1==true)
	
	{
		
		count_alpha++;
	}
}

System.out.println(count_alpha);
		
		
	}

}
