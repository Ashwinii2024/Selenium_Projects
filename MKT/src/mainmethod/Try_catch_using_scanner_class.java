package mainmethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_using_scanner_class 

{

	public static void main(String[] args) 
	
	{
		try {
		Scanner s1 = new Scanner(System.in);
		String name[] = new String[2];
		
		name[0] = s1.next();
		name[1]=  s1.next();
		name[2] = s1.next();
		
		int number = s1.nextInt();
		
		
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("We handled the exception ArrayIndexOutOfBoundsException");
		}
		catch (InputMismatchException s){
			System.out.println("We handled the InputMismatchException exception");
			
		
	}

}
}
