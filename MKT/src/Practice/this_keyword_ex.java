package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class this_keyword_ex 

{
	
	
	public static void main(String[] args) 
	
	{
		
		Scanner s1 = new Scanner(System.in);
		//2*pi*r;
		System.out.println("Value of pi is");
		final double pi =3.14;
		System.out.println(pi);
		System.out.println("Please put the value of radius");
		int r = s1.nextInt();
		double Area_Of_Circle = 2*pi*r;
		System.out.println("The out put is :" + Area_Of_Circle);
		
		
	}
	

}
