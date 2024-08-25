package Practice;

import java.util.Scanner;

public class Palindrom__UsingScanner_Class {

	public static void main(String[] args) 
	
	{

		
Scanner s1 = new Scanner(System.in);

String str1 = s1.next();
//System.out.println(str1);
String str2 = "";

for(int i = str1.length()-1; i>=0; i--) 

{
	
	char c1 = str1.charAt(i);
	str2 = str2+c1;
}

System.out.println(str2);

if(str1.equals(str2)) {
	
	System.out.println("Palindrom");
}

else {
	System.out.println("Not Palindrom");
}






	


	}

}
