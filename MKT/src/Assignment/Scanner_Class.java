package Assignment;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) 
	
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String FirstName = S1.next();
		System.out.println("Enter Last Name :");
		String LastName = S1.next();
		System.out.println("Enter Email :");
		String Email = S1.next();
		System.out.println("Enter Password :");
		String Password = S1.next();
		System.out.println("Please select Gender :");
		String gender  = S1.next();
		System.out.println("Enter Present Address :");
		String PresentAddress = S1.next();
		System.out.println("Enter Permanent Address :");
		String PermanentAddress  = S1.next();
		System.out.println("Enter Pincode :");
		int Pincode  = S1.nextInt();
		System.out.println("Submit");
		
		
		
	}

}
