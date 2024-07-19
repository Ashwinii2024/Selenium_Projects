package mainmethod;

import java.util.Arrays;

public class Copy_One_Array_Into_Another_Array

{

	public static void main(String[] args) 
	
	{
		int input[] = new int[3];
		input[0] = 11;
		input[1] = 12;
		input[2] = 13;
		
		int output[] = new int[3];
		
		for(int i = 0; i<=2; i++)
			
		{
			
			output[i]= input[i];
			
		}
		
		System.out.println(Arrays.toString(input));
		
		System.out.println(Arrays.toString(output));
		
		
	}

}
