package Assignment;

import java.util.Scanner;

public class Circu_Rectangle {

	public static void main(String[] args) {
		//P = 2l + 2w
		
	Scanner S1= new Scanner (System.in);
	System.out.println("Print the value of l");
	int l = S1.nextInt();
	System.out.println("Print the value of w");
	int w = S1.nextInt();
	int CircuRectangle = (2*l + 2*w);
	System.out.println("Outpput of CircuRectangle is ");
	System.out.println(CircuRectangle);
	
	

	}

}
