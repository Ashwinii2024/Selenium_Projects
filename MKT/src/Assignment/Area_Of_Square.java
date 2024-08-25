package Assignment;

import java.util.Scanner;

public class Area_Of_Square 

{

	public static void main(String[] args) 
	
	{
		//int s=13;
		//int area_square=s*s;
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Print radius");
		
		int s = S1.nextInt();
		
		System.out.println("Output of AreaOfsquare");
		int AreaOfsquare = s*s;
		
		System.out.println(AreaOfsquare);
		

	}

}
