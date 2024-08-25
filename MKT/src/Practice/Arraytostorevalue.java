package Practice;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arraytostorevalue {

	public static void main(String[] args) 
	
	{
	int name[] = new int[4];
	
	Scanner s1 = new Scanner(System.in);
	
	try {
	name[0] =s1.nextInt();
	
	
	name[1]=s1.nextInt();

		
	name[2]=s1.nextInt();
	
	name[3]=s1.nextInt();
	
	name[4] =s1.nextInt();
	
	
	
	
	System.out.println(Arrays.toString(name));
	
	}
	catch(InputMismatchException a) {
		
		System.out.println("We handle inputmisatch");
	}
	
	}
}
