package Assignment;

import java.util.Scanner;

public class Area_Of_Triangle

{

	public static void main(String[] args)
	
	{
		
//1/2(b*h)
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Print bandwidth");
		
		int b = S1.nextInt();
		
		System.out.println("Print height");
		
		int h = S1.nextInt();
		
		System.out.println("Area Of Triangle");
		
		int area = ( b*h) / 2;
		System.out.println(area);
		
		
		
	}

}
