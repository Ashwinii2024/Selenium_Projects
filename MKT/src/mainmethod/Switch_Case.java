package mainmethod;

import java.util.Scanner;




public class Switch_Case {

	public static void main(String[] args) 
	
	{
		Scanner s1 = new Scanner(System.in);
		int value = s1.nextInt();
		System.out.println("Press 1 for Launch Chrome");
		System.out.println("Press 2 for Launch  Firefox");
		System.out.println("Press 3 for Launch  Safari");
		System.out.println("Press 4 for Launch  Edge");
		switch(value) {
		case 1:
			System.out.println("Launch Chrome Browser");
			break;
		case 2:
			System.out.println("Launch Firefox Browser");
			break;
		case 3:
			System.out.println("Launch Safari Browser");
			break;
		case 4:
			System.out.println("Launch Edge Browser");
			break;
			default:
				System.out.println("Sorry Your Selection is wrong");
		}
	}

}
