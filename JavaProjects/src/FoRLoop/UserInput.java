package FoRLoop;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y, sum;

Scanner myObj = new Scanner(System.in);

System.out.println("Type a Number:");

x = myObj.nextInt();

System.out.println("Type another number: ");
 y = myObj.nextInt();
 
 sum = x+y;
 System.out.println("Sum is: " + sum);

	}

}
