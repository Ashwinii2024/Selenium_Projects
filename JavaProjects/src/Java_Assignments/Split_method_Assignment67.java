package Java_Assignments;

import java.util.Arrays;

public class Split_method_Assignment67 {

	public static void main(String[] args) 
	
	{
		String s1 = "My Name is Ashwini";
		String a1[] = s1.split(" ");
		System.out.println(Arrays.toString(a1));
		
		String a2[] = s1.split(" ", 2);
		System.out.println(Arrays.toString(a2));

	}

}
