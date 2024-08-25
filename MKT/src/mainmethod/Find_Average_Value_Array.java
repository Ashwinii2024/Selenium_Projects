package mainmethod;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



	
public class Find_Average_Value_Array 


{
	

	public static void main(String[] args)
	
	{
	int number[] = {1,2,3,4,5};
	
	int sum =0;
	
	for(int i=0;i<number.length;i++) 
	{
		sum = sum + number[i];
		
		
	}
	int average = (sum/(number.length-1));
	//System.out.println(sum/number.length);
	System.out.println(average);
	
	}
	
}

