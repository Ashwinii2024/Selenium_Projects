package mainmethod;

import java.util.Arrays;

public class Concatination {

	public static void main(String[] args)
	
	{
		String Fname ="Ram";
		String Lname ="Shyam";
		System.out.println(Fname.concat(Lname));
		System.out.println(Fname.concat("").concat(Lname));
		
		
		String name = "Nakshatra Ashwini Yogesh pawar";
	String a1[] = name.split(" ");
	String a2[] = name.split(" ", 2);
	String a3[] = name.split(" ", 'h');
	
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	System.out.println(Arrays.toString(a3));

	
	}

}
