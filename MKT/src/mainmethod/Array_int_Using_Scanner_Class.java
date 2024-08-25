package mainmethod;

import java.util.Arrays;
import java.util.Scanner;

public class Array_int_Using_Scanner_Class {

	public static void main(String[] args) 
	
	{
		Scanner s1 = new Scanner(System.in);
		
		//int datatype
		int i[] = new int[3];
		i[0] = s1.nextInt();
		i[1] = s1.nextInt();
		i[2] = s1.nextInt();
		System.out.println(Arrays.toString(i));
		

		//double datatype
		double d[] = new double[4];
		
		d[0] = s1.nextDouble();
		d[1] = s1.nextDouble();
		d[2] = s1.nextDouble();
		d[3] =s1.nextDouble();
		
		System.out.println(Arrays.toString(d));
		
		//boolean datatype
		
		boolean b[] = new boolean[2];
		b[0] = s1.nextBoolean();
		b[1] = s1.nextBoolean();
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
	}

}
