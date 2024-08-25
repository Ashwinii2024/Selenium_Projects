package mainmethod;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) 
	
	{
		int input[] = new int[3];
		
		int Reverseinput[] = new int[3];
		
		input[0] =12;
		input[1]=23;
		input[2]=90;
		
		System.out.println(Arrays.toString(input));
		
		int j=0;
		
		for(int i=input.length-1;i>=0;i--)
		{
			Reverseinput[j] = input[i];
			j++;
		}
		
		System.out.println(Arrays.toString(Reverseinput));

	}

}
