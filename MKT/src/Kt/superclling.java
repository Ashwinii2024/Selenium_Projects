package Kt;

import java.util.Arrays;

public class superclling   

{
	public static void main(String[] args) 
	
	{
		
		int input[] = {12,23,21,33} ;
		int output[] = {}; 
		
		for(int i=input.length-1;i>=0;i--)
		{
			
			output[i]=input[i];
			
		}
		
			
		System.out.println(Arrays.toString(output));
		
		
    }
}