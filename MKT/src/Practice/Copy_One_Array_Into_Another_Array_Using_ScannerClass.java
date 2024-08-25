package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_One_Array_Into_Another_Array_Using_ScannerClass

{

	public static void main(String[] args) 
	
	{
	Scanner s1 = new Scanner(System.in);
		String input[] = new String[2];
		input[0] ="ashu";
		input[1] ="nakshu";
		
		String output[] = new String[2];
		
		for(int i = 0; i<2; i++) 
		{
			output[i]=input[i];
		}
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
	}

}
