package Practice;

import java.util.Scanner;

public class Scanner_ClassEx 

{
  public static void main(String[] args) {
	  
	  Scanner s1 = new Scanner(System.in);
	  
	  System.out.println("Add a value");
	  int a = s1.nextInt();
	  System.out.println("Add b value");
	  int b= s1.nextInt();	
	  System.out.println("Add a & b");
	  int c= a + b;
	  System.out.println(c);
	  System.out.println("Print the d");
	  double d = s1.nextDouble();
	  System.out.println("Print the f");
	  double f = s1.nextDouble();
	  double sum = d + f;
	  System.out.println(sum);
	  System.out.println("Print the boolean value");
	  boolean h = s1.nextBoolean();
  }
}
