package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Boolean_Using_Scanner 

{

	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);
		
		int i[] = new int[3];
		i[0] = S1.nextInt();
		i[1] = S1.nextInt();
		i[2] = S1.nextInt();
		System.out.println(Arrays.toString(i));
		
		String str[] = new String[2];
		str[0] = S1.next();
		str[1]=S1.next();
		System.out.println(Arrays.toString(str));
	
	}
	
}

