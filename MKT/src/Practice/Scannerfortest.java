package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerfortest {

	public static void main(String[] args)
	
	{
		 String s1 = "care";
		 String s2="race";
		char c1[] = s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		
		char c2[] = s2.toCharArray();
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c2));
		
		boolean b1 = Arrays.equals(c1, c2);
		if(b1==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
	}

}
