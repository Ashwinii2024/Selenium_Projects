package Assignment;

import java.util.Scanner;

public class Area_Of_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A= W x H  
		
		Scanner  S1 = new Scanner(System.in);
		
		System.out.println("Print Width");
		
		int W = S1.nextInt();
		
		System.out.println("Print Height");
		
		int H = S1.nextInt();
		
		int A = W * H;
		
		System.out.println("Area Of Rectangle");
		
		System.out.println(A);
		
		

	}

}
